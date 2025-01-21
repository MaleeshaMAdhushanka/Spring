package lk.ecommerce.config;

import lk.ecommerce.bean.MyConnection;
import lk.ecommerce.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//bean tika scan kara
@ComponentScan(basePackages = "lk.ecommerce.bean")
//@ComponentScan(basePackageClasses = SpringBean.class)
public class AppConfig {
    //context tikata bean tika wetenne
    @Bean("connection")
    //third party beans  for newly craeted beans
    @Scope("prototype")
    MyConnection getConnection() {
        return new MyConnection();
    }

}
