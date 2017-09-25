package ro.b1nnar.examples.jaxws.types;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(namespace = "http://jaxws.examples.b1nnar.ro/", name = "sayHelloResponse")
public class SayHelloResponse {

    private String message;

    @XmlElement(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}