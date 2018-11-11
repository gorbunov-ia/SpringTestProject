package spring.test.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import spring.test.entity.EmptyClass;

public class ClassWithAutowired {

    private EmptyClass emptyClass;

    public EmptyClass getEmptyClass() {
        return emptyClass;
    }

    @Autowired
    public void setEmptyClass(EmptyClass emptyClass) {
        this.emptyClass = emptyClass;
    }

    @Override
    public String toString() {
        return "ClassWithAutowired{" +
                "emptyClass=" + emptyClass +
                '}';
    }
}
