package ro.b1nnar.examples.jaxws.services;

import org.springframework.stereotype.Service;
import ro.b1nnar.examples.jaxws.types.SayHelloRequest;
import ro.b1nnar.examples.jaxws.types.SayHelloResponse;

@Service
public class HelloHelperServiceImpl implements HelloHelperService {

    @Override
    public SayHelloResponse from(SayHelloRequest sayHelloRequest) {
        SayHelloResponse sayHelloResponse = new SayHelloResponse();
        sayHelloResponse.setMessage("Hello, " + sayHelloRequest.getName() + ".");

        return sayHelloResponse;
    }
}
