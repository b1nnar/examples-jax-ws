package ro.b1nnar.examples.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(targetNamespace = "http://jaxws.examples.b1nnar.ro/")
@SOAPBinding(
        style=SOAPBinding.Style.DOCUMENT,
        use=SOAPBinding.Use.LITERAL,
        parameterStyle=SOAPBinding.ParameterStyle.WRAPPED
)
public interface HelloService {

    @WebMethod
    String sayHello(@WebParam(name = "name") String name);
}