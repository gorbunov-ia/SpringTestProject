package spring.test.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

class Singleton {

    @Autowired
    private ObjectFactory<Prototype> prototypeFactory;

    private Prototype getPrototype() {
        return prototypeFactory.getObject();
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "prototype=" + getPrototype() +
                '}';
    }
}
