package mypack;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;



@WebServiceClient(name = "CalculatorService", targetNamespace = "http://p1/", wsdlLocation = "http://localhost:8081/MyCalculatorWs/CalculatorService?WSDL")
public class CalculatorService
        extends Service
{

    private final static URL CALCULATORSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8081/MyCalculatorWs/CalculatorService?WSDL");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        CALCULATORSERVICE_WSDL_LOCATION = url;
    }

    public CalculatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculatorService() {
        super(CALCULATORSERVICE_WSDL_LOCATION, new QName("http://p1/", "CalculatorService"));
    }

    /**
     *
     * @return
     *     returns Calculator
     */
    @WebEndpoint(name = "CalculatorPort")
    public Calculator getCalculatorPort() {
        return (Calculator)super.getPort(new QName("http://p1/", "CalculatorPort"), Calculator.class);
    }

}