package ro.b1nnar.examples.jaxws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class HelloServiceImpl implements HelloService {

    private static final Logger LOG = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Resource
    private WebServiceContext webServiceContext;

    @PostConstruct
    public void postConstruct() {
        LOG.info("Post Construct");
    }

    @PreDestroy
    public void preDestroy() {
        LOG.info("Pre Destroy");
    }

    @Override
    public String sayHello(String name) {
        LOG.info("sayHello for " + name);

        return "Hello, " + name + ".";
    }
}