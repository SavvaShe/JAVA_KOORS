package mypack;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;



@WebService(name = "Calculator", targetNamespace = "http://p1/")
public interface Calculator {


    /**
     *
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sum", targetNamespace = "http://p1/", className = "mypack.Sum")
    @ResponseWrapper(localName = "sumResponse", targetNamespace = "http://p1/", className = "mypack.SumResponse")
    public String sum(
            @WebParam(name = "arg0", targetNamespace = "")
                    int arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    int arg1);

}