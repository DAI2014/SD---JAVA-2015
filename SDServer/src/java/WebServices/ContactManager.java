package WebServices;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ContactManager")
public class ContactManager {

    boolean found;
    ArrayList<Presences> presences = new ArrayList();
    ArrayList<Messages> messages = new ArrayList();

    @WebMethod(operationName = "getContactList")
    public ArrayList<Presences> getContactList(@WebParam(name = "ip") String ip, @WebParam(name = "nome") String nome, @WebParam(name = "curso") String curso, @WebParam(name = "email") String email) {
        long actualTime = new Date().getTime();
        found = false;
        for (int i = 0; i < presences.size(); i++) {
            if (presences.get(i).getEmail().equals(email)) {
                found = true;
                presences.get(i).setIp(ip);
                presences.get(i).setLastSeen(actualTime);
            }
        }
        if (found == false) {

            Presences newPresence = new Presences();
            newPresence.setIp(ip);
            newPresence.setNome(nome);
            newPresence.setCurso(curso);
            newPresence.setLastSeen(new Date().getTime());
            newPresence.setEmail(email);
            newPresence.setLastSeen(actualTime);
            System.out.println(newPresence);
            presences.add(newPresence);

        }
        ArrayList<Presences> presencesSend = new ArrayList<>();
        for (int i = 0; i < presences.size(); i++) {
            if (presences.get(i).timeOutPassed(300000) == false && !presences.get(i).getEmail().equals(email)) {
                presencesSend.add(presences.get(i));
            }
        }

        return presencesSend;
    }

    public String getIp(String mac) {
        String line = "";
        String ip = "";
        try {
            // Create URL
            String urllink = "http://local.dsi.uminho.pt:8080/locationserver/LS?f=f1&l=appltest&p=testpwd&mac=" + mac;
            URL url = new URL(urllink);
            StringBuffer sb = new StringBuffer();

            // Create a connection.
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            urlConnection.setRequestProperty("Content-type", "application/json");
            urlConnection.setAllowUserInteraction(true);

            urlConnection.connect();

            InputStream stream = urlConnection.getInputStream();
            InputStreamReader isReader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(isReader);

            int i = 0;
            while ((line = br.readLine()) != null) {

                i++;
                if (i == 5) {
                    ip = line.substring(12, 23);
                    sb.append(line);
                }
            }

            stream.close();
            br.close();
            urlConnection.disconnect();

        } catch (Exception e) {
            System.out.println("Exception:: " + e.getMessage());
        }
        return ip;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sendMessage")
    public boolean sendMessage(@WebParam(name = "message") String message, @WebParam(name = "coordenadas") String coordenadas, @WebParam(name = "owner") String owner, @WebParam(name = "token") String token, @WebParam(name = "status") String status, @WebParam(name = "macAddress") String macAddress) {
        Messages m = new Messages();
        m.setMessage(message);
        m.setOwner(owner);
        m.setStatus(status);
        m.setToken(token);
        m.setPlace(getLocation(macAddress));
        m.setCoordenadas(coordenadas);
        messages.add(m);
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMessage")
    public ArrayList<Messages> getMessage(@WebParam(name = "email") String email, @WebParam(name = "tokens") ArrayList<String> tokens, @WebParam(name = "macAddress") String macAddress) {
        ArrayList<Messages> mes = new ArrayList<>();
        for (int i = 0; i < messages.size(); i++) {
            switch (messages.get(i).getStatus()) {
                case "Private":
                    for (int j = 0; j < tokens.size(); j++) {
                        if (messages.get(i).getToken().equals(tokens.get(j))) {
                            mes.add(messages.get(i));
                        }
                    }
                    break;
                case "Local":
                    if (messages.get(i).getPlace().equals(getLocation(macAddress))) {
                        mes.add(messages.get(i));
                    }
                    break;
                case "Public":
                    mes.add(messages.get(i));
                    break;
            }
        }
        return mes;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getLocation")
    public String getLocation(@WebParam(name = "macAddress") String macAddress) {
        String ip = getIp(macAddress);
        System.out.println(ip);
        String location = "";
        switch (ip) {
            case "192.168.0.1":
                location = "Escola de Engenharia";
                break;
            case "192.168.0.2":
                location = "Bloco B";
                break;
            case "192.168.0.3":
                location = "Escola de Ciencias";
                break;
            case "192.168.0.4":
                location = "Escola de Arquitetura";
                break;

        }

        return location;
    }

}
