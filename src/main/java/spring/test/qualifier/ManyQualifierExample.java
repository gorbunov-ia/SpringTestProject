package spring.test.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ManyQualifierExample {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        final ListOfA bean = context.getBean(ListOfA.class);
        System.out.println(bean);
    }

}
