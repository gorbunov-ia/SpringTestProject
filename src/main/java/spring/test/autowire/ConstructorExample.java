package spring.test.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.test.entity.ClassWithConstructor;

public class ConstructorExample {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowire/constructor.xml");

        final ClassWithConstructor bean = context.getBean(ClassWithConstructor.class);
        System.out.println(bean);
    }
}
