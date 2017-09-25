package ro.b1nnar.examples.jaxws;

import ro.b1nnar.examples.jaxws.types.SayHelloRequest;
import ro.b1nnar.examples.jaxws.types.SayHelloResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(targetNamespace = "http://jaxws.examples.b1nnar.ro/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HelloService {

    @WebMethod(operationName = "sayHello")
    @WebResult(targetNamespace = "http://jaxws.examples.b1nnar.ro/", name = "sayHelloResponse")
    SayHelloResponse sayHello(@WebParam(targetNamespace = "http://jaxws.examples.b1nnar.ro/", name = "sayHelloRequest") SayHelloRequest sayHelloRequest);
}