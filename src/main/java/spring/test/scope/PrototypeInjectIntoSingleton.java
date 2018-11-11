package spring.test.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class PrototypeInjectIntoSingleton {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        System.out.println(context.getBean(Singleton.class));
        System.out.println(context.getBean(Singleton.class));
    }

    static class Config {

        @Bean
        public Singleton s() {
            return new Singleton();
        }

        @Bean
        @Scope("prototype")
        public Prototype p() {
            return new Prototype();
        }

    }

}
