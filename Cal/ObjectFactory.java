package mypack;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



@XmlRegistry
public class ObjectFactory {

    private final static QName _Sum_QNAME = new QName("http://p1/", "sum");
    private final static QName _SumResponse_QNAME = new QName("http://p1/", "sumResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypack
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Sum }
     *
     */
    public Sum createSum() {
        return new Sum();
    }

    /**
     * Create an instance of {@link SumResponse }
     *
     */
    public SumResponse createSumResponse() {
        return new SumResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sum }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://p1/", name = "sum")
    public JAXBElement<Sum> createSum(Sum value) {
        return new JAXBElement<Sum>(_Sum_QNAME, Sum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://p1/", name = "sumResponse")
    public JAXBElement<SumResponse> createSumResponse(SumResponse value) {
        return new JAXBElement<SumResponse>(_SumResponse_QNAME, SumResponse.class, null, value);
    }

}