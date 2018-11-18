package spring.test.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;

public class SpringFactoryExample {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        final OperatorFactory operatorFactory = context.getBean(OperatorFactory.class);
        System.out.println(operatorFactory.getSupportOperators());

        Assert.isTrue(Double.valueOf(10).equals(operatorFactory.getOperator("add").apply(5, 5)),
                "add operator exception");
        Assert.isTrue(Double.valueOf(25).equals(operatorFactory.getOperator("multiply").apply(5, 5)),
                "multiply operator exception");
        Assert.isTrue(Double.valueOf(1).equals(operatorFactory.getOperator("divide").apply(5, 5)),
                "divide operator exception");
    }

    @Configuration
    static class Config {

        @Bean("add")
        public Operator addBean() {
            return new AddOperator();
        }

        @Bean("multiply")
        public Operator multiplyBean() {
            return new MultiplyOperator();
        }

        @Bean("divide")
        public Operator divideBean() {
            return new DivideOperator();
        }

        @Bean
        public OperatorFactory operatorFactory(Map<String, Operator> operatorMap) {
            return new OperatorFactory(operatorMap);
        }

    }

    static class OperatorFactory {
        private final Map<String, Operator> operatorMap;

        OperatorFactory(Map<String, Operator> operatorMap) {
            this.operatorMap = operatorMap;
        }

        Collection<String> getSupportOperators() {
            return new HashSet<>(operatorMap.keySet());
        }

        Operator getOperator(String operatorName) {
            return Optional.ofNullable(operatorMap.get(operatorName))
                    .orElseThrow(IllegalArgumentException::new);
        }
    }


    interface Operator {
        double apply(int x, int y);
    }

    static class AddOperator implements Operator {

        @Override
        public double apply(int x, int y) {
            return x + y;
        }
    }

    static class MultiplyOperator implements Operator {

        @Override
        public double apply(int x, int y) {
            return x * y;
        }
    }

    static class DivideOperator implements Operator {

        @Override
        public double apply(int x, int y) {
            return ((double) x) / y;
        }
    }
}
