package spring.test.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.test.entity.ClassWithSetter;

public class ByTypeExample {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowire/byType.xml");

        final ClassWithSetter bean = context.getBean(ClassWithSetter.class);
        System.out.println(bean);
    }
}
