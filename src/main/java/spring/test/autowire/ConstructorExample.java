package spring.test.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorExample {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowire/constructor.xml");

        final B bean = context.getBean(B.class);
        System.out.println(bean);
    }
}
