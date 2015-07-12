
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetLocationResponse_QNAME = new QName("http://WebServices/", "getLocationResponse");
    private final static QName _GetLocation_QNAME = new QName("http://WebServices/", "getLocation");
    private final static QName _GetContactListResponse_QNAME = new QName("http://WebServices/", "getContactListResponse");
    private final static QName _GetIp_QNAME = new QName("http://WebServices/", "getIp");
    private final static QName _GetMessage_QNAME = new QName("http://WebServices/", "getMessage");
    private final static QName _SendMessage_QNAME = new QName("http://WebServices/", "sendMessage");
    private final static QName _GetContactList_QNAME = new QName("http://WebServices/", "getContactList");
    private final static QName _GetIpResponse_QNAME = new QName("http://WebServices/", "getIpResponse");
    private final static QName _GetMessageResponse_QNAME = new QName("http://WebServices/", "getMessageResponse");
    private final static QName _SendMessageResponse_QNAME = new QName("http://WebServices/", "sendMessageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLocationResponse }
     * 
     */
    public GetLocationResponse createGetLocationResponse() {
        return new GetLocationResponse();
    }

    /**
     * Create an instance of {@link GetLocation }
     * 
     */
    public GetLocation createGetLocation() {
        return new GetLocation();
    }

    /**
     * Create an instance of {@link GetContactListResponse }
     * 
     */
    public GetContactListResponse createGetContactListResponse() {
        return new GetContactListResponse();
    }

    /**
     * Create an instance of {@link GetIp }
     * 
     */
    public GetIp createGetIp() {
        return new GetIp();
    }

    /**
     * Create an instance of {@link GetMessage }
     * 
     */
    public GetMessage createGetMessage() {
        return new GetMessage();
    }

    /**
     * Create an instance of {@link SendMessage }
     * 
     */
    public SendMessage createSendMessage() {
        return new SendMessage();
    }

    /**
     * Create an instance of {@link GetContactList }
     * 
     */
    public GetContactList createGetContactList() {
        return new GetContactList();
    }

    /**
     * Create an instance of {@link GetIpResponse }
     * 
     */
    public GetIpResponse createGetIpResponse() {
        return new GetIpResponse();
    }

    /**
     * Create an instance of {@link SendMessageResponse }
     * 
     */
    public SendMessageResponse createSendMessageResponse() {
        return new SendMessageResponse();
    }

    /**
     * Create an instance of {@link GetMessageResponse }
     * 
     */
    public GetMessageResponse createGetMessageResponse() {
        return new GetMessageResponse();
    }

    /**
     * Create an instance of {@link Presences }
     * 
     */
    public Presences createPresences() {
        return new Presences();
    }

    /**
     * Create an instance of {@link Messages }
     * 
     */
    public Messages createMessages() {
        return new Messages();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "getLocationResponse")
    public JAXBElement<GetLocationResponse> createGetLocationResponse(GetLocationResponse value) {
        return new JAXBElement<GetLocationResponse>(_GetLocationResponse_QNAME, GetLocationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "getLocation")
    public JAXBElement<GetLocation> createGetLocation(GetLocation value) {
        return new JAXBElement<GetLocation>(_GetLocation_QNAME, GetLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "getContactListResponse")
    public JAXBElement<GetContactListResponse> createGetContactListResponse(GetContactListResponse value) {
        return new JAXBElement<GetContactListResponse>(_GetContactListResponse_QNAME, GetContactListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "getIp")
    public JAXBElement<GetIp> createGetIp(GetIp value) {
        return new JAXBElement<GetIp>(_GetIp_QNAME, GetIp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "getMessage")
    public JAXBElement<GetMessage> createGetMessage(GetMessage value) {
        return new JAXBElement<GetMessage>(_GetMessage_QNAME, GetMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "sendMessage")
    public JAXBElement<SendMessage> createSendMessage(SendMessage value) {
        return new JAXBElement<SendMessage>(_SendMessage_QNAME, SendMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "getContactList")
    public JAXBElement<GetContactList> createGetContactList(GetContactList value) {
        return new JAXBElement<GetContactList>(_GetContactList_QNAME, GetContactList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "getIpResponse")
    public JAXBElement<GetIpResponse> createGetIpResponse(GetIpResponse value) {
        return new JAXBElement<GetIpResponse>(_GetIpResponse_QNAME, GetIpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "getMessageResponse")
    public JAXBElement<GetMessageResponse> createGetMessageResponse(GetMessageResponse value) {
        return new JAXBElement<GetMessageResponse>(_GetMessageResponse_QNAME, GetMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "sendMessageResponse")
    public JAXBElement<SendMessageResponse> createSendMessageResponse(SendMessageResponse value) {
        return new JAXBElement<SendMessageResponse>(_SendMessageResponse_QNAME, SendMessageResponse.class, null, value);
    }

}
