package lk.ecommerce.bean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBean {

    public SpringBean() {
        System.out.println("Spring Bean1 Object Created");
    }


}
