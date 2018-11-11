package spring.test.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.test.entity.ClassWithSetter;
import spring.test.entity.EmptyClass;

public class QualifierAnotherType {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QualifierAnotherType.Config.class);

        final ClassWithQualifier bean = context.getBean(ClassWithQualifier.class);
        System.out.println(bean);
    }

    @Configuration
    static class Config {

        @Bean
        public EmptyClass beanA() {
            return new EmptyClass();
        }

        @Bean
        public EmptyClass beanB() {
            return new EmptyClass();
        }

        @Bean
        @Qualifier("beanAnotherType")
        public ClassWithSetter classWithSetter() {
            return new ClassWithSetter();
        }

        @Bean
        public ClassWithQualifier classWithQualifier() {
            return new ClassWithQualifier();
        }

    }
}
