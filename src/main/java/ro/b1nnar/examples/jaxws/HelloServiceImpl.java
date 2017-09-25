package ro.b1nnar.examples.jaxws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.b1nnar.examples.jaxws.types.SayHelloRequest;
import ro.b1nnar.examples.jaxws.types.SayHelloResponse;
import weblogic.jws.Policies;
import weblogic.jws.Policy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

@WebService(
        name = "HelloService",
        serviceName = "HelloService",
        portName = "HelloServicePort",
        targetNamespace = "http://jaxws.examples.b1nnar.ro/",
        endpointInterface = "ro.b1nnar.examples.jaxws.HelloService"
)
@Policies({@Policy(uri = "policy:usernametoken.xml")})
public class HelloServiceImpl implements HelloService {

    private static final Logger LOG = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Resource
    private WebServiceContext webServiceContext;

    public HelloServiceImpl() {
    }

    @PostConstruct
    public void postConstruct() {
        LOG.info("Post Construct");
    }

    @PreDestroy
    public void preDestroy() {
        LOG.info("Pre Destroy");
    }

    @Override
    public SayHelloResponse sayHello(SayHelloRequest sayHelloRequest) {
        LOG.info("sayHello for " + sayHelloRequest.getName());

        SayHelloResponse sayHelloResponse = new SayHelloResponse();
        sayHelloResponse.setMessage("Hello, " + sayHelloRequest.getName() + ".");

        return sayHelloResponse;
    }
}