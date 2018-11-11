package spring.test.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.test.entity.EmptyClass;

public class AutowireByNameAnnotationExample {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        System.out.println(context.getBean(ClassWithAutowired.class));

        System.out.println(context.getBean(ClassWithResource.class));
    }

    @Configuration
    static class Config {

        @Bean
        public EmptyClass emptyClass() {
            return new EmptyClass();
        }

        @Bean
        public EmptyClass beanWithAnotherName() {
            return new EmptyClass();
        }

        @Bean
        public ClassWithAutowired badApproach() {
            return new ClassWithAutowired();
        }

        @Bean
        public ClassWithResource goodApproch() {
            return new ClassWithResource();
        }

    }

}
