package spring.test.autowire;

class B {
    private final A a;

    B(A a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                '}';
    }
}
