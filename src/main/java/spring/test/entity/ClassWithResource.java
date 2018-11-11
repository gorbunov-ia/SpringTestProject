package spring.test.entity;

import javax.annotation.Resource;

public class ClassWithResource {

    private EmptyClass emptyClass;

    public EmptyClass getEmptyClass() {
        return emptyClass;
    }

    @Resource
    public void setEmptyClass(EmptyClass emptyClass) {
        this.emptyClass = emptyClass;
    }

    @Override
    public String toString() {
        return "ClassWithResource{" +
                "emptyClass=" + emptyClass +
                '}';
    }
}
