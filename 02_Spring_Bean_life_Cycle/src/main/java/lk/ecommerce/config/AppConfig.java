package lk.ecommerce.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//bean tika scan kara
@ComponentScan(basePackages = "lk.ecommerce.bean")
public class AppConfig {

}
