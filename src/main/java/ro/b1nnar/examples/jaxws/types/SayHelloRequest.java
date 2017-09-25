package ro.b1nnar.examples.jaxws.types;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(namespace = "http://jaxws.examples.b1nnar.ro/", name = "sayHelloRequest")
public class SayHelloRequest {

    private String name;

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}