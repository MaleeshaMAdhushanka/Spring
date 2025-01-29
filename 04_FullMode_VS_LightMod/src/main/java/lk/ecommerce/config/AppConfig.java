package lk.ecommerce.config;

import lk.ecommerce.bean.SpringBeanOne;
import lk.ecommerce.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ecommerce.bean")
public class AppConfig {

 // third pary libary ekkain apu ekakain claz ekka hadala Companet nethuwa bean ekka hadala wena claz ekaka ewa run karaganna oni nam
    @Bean
    public SpringBeanOne getSpringBeanOne(){
        //bena ekak ethule thawa bean ekak invoke karanwata(call) dependancy ekaata api kiyyanwa interbean dependancy ekak
        SpringBeanTwo springBeanTwo1 = getSpringBeanTwo();
        SpringBeanTwo springBeanTwo2 = getSpringBeanTwo();
        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo getSpringBeanTwo(){
        return new SpringBeanTwo();
    }
}
