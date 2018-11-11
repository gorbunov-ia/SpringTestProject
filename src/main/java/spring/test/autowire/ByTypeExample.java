package spring.test.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByTypeExample {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowire/byType.xml");

        final C bean = context.getBean(C.class);
        System.out.println(bean);
    }
}
