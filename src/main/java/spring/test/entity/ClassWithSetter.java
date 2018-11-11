package spring.test.entity;

public class ClassWithSetter {
    private EmptyClass emptyClass;

    public EmptyClass getEmptyClass() {
        return emptyClass;
    }

    public void setEmptyClass(EmptyClass emptyClass) {
        this.emptyClass = emptyClass;
    }

    @Override
    public String toString() {
        return "ClassWithSetter{" +
                "emptyClass=" + emptyClass +
                '}';
    }
}
