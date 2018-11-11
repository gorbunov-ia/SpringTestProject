package spring.test.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import spring.test.entity.EmptyClass;

public class ClassWithQualifier {

    private EmptyClass emptyClass;

    public EmptyClass getEmptyClass() {
        return emptyClass;
    }

    @Autowired
    @Qualifier("beanAnotherType")
    public void setEmptyClass(EmptyClass emptyClass) {
        this.emptyClass = emptyClass;
    }

    @Override
    public String toString() {
        return "ClassWithQualifier{" +
                "emptyClass=" + emptyClass +
                '}';
    }
}
