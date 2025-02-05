package lk.ecommerce.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements BeanNameAware, ApplicationContextAware {

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanOne Bean Name: " + name);
    }
//    public SpringBeanOne() {
//        System.out.println("Spring Bean One Constructor");
//    }

    @Bean
    public SpringBeanTwo springBeanTwo() {

//        SpringBeanThree springBeanThree1 = springBeanThree();
//        SpringBeanThree springBeanThree2 = springBeanThree();
//        System.out.println(springBeanThree1);
//        System.out.println(springBeanThree2);

        return new SpringBeanTwo();
//        SpringBeanThree springBeanThree1 = new SpringBeanThree();
//        SpringBeanThree springBeanThree2 = new SpringBeanThree();
//        System.out.println(springBeanThree1);
//        System.out.println(springBeanThree2);
//
//        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree springBeanThree() {
        return new SpringBeanThree();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanThree Application Context: " + applicationContext);

    }
}
