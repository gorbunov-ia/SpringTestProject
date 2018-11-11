package spring.test.resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.test.entity.ClassWithResource;
import spring.test.entity.EmptyClass;

public class InjectByTypeWithResource {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InjectByTypeWithResource.Config.class);

        System.out.println(context.getBean(ClassWithResource.class));
    }

    @Configuration
    static class Config {

        @Bean
        public EmptyClass beanWithAnotherName() {
            return new EmptyClass();
        }

        @Bean
        public ClassWithResource classWithResource() {
            return new ClassWithResource();
        }

    }

}
