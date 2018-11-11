package spring.test.entity;

public class ClassWithConstructor {
    private final EmptyClass emptyClass;

    ClassWithConstructor(EmptyClass emptyClass) {
        this.emptyClass = emptyClass;
    }

    @Override
    public String toString() {
        return "ClassWithConstructor{" +
                "emptyClass=" + emptyClass +
                '}';
    }
}
