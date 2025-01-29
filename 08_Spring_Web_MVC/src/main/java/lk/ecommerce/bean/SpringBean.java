package lk.ecommerce.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean() {
        System.out.println("Spring Bean Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBean Bean Factory: " + beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBean Bean Name: " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBean Destroy Method");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean After Properties Set Method");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean Application Context: " + applicationContext);
    }
}
