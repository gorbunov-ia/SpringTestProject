package spring.test.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.test.entity.EmptyClass;

@Configuration
class Config {

    @Bean
    @Qualifier("groupA")
    public EmptyClass beanA() {
        return new EmptyClass();
    }

    @Bean
    @Qualifier("groupA")
    public EmptyClass beanB() {
        return new EmptyClass();
    }

    @Bean
    @Qualifier("groupC")
    public EmptyClass beanC() {
        return new EmptyClass();
    }

    @Bean
    public ListOfEmptyClass beanList() {
        return new ListOfEmptyClass();
    }

}
