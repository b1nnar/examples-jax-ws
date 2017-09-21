package ro.b1nnar.examples.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://jaxws.examples.b1nnar.ro/")
public interface HelloService {

    @WebMethod
    String sayHello(@WebParam(name = "name") String name);
}