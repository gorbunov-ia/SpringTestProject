package spring.test.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Config {

    @Bean
    @Qualifier("groupA")
    public A beanA() {
        return new A();
    }

    @Bean
    @Qualifier("groupA")
    public A beanB() {
        return new A();
    }

    @Bean
    @Qualifier("groupC")
    public A beanC() {
        return new A();
    }

    @Bean
    public ListOfA beanList() {
        return new ListOfA();
    }

}
