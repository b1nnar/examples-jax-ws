package ro.b1nnar.examples.jaxws.services;

import ro.b1nnar.examples.jaxws.types.SayHelloRequest;
import ro.b1nnar.examples.jaxws.types.SayHelloResponse;

public interface HelloHelperService {

    SayHelloResponse from(SayHelloRequest sayHelloRequest);
}
