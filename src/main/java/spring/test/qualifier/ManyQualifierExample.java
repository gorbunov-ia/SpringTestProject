package spring.test.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ManyQualifierExample {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        final ListOfEmptyClass bean = context.getBean(ListOfEmptyClass.class);
        System.out.println(bean);
    }

}
