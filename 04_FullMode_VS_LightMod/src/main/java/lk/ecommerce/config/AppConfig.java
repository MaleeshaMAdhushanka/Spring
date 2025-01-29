package lk.ecommerce.config;

import lk.ecommerce.bean.SpringBeanOne;
import lk.ecommerce.bean.SpringBeanThree;
import lk.ecommerce.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ecommerce.bean")
public class AppConfig {

//    @Bean
//    public SpringBeanTwo springBeanTwo(){
//        SpringBeanThree springBeanThree1 = new SpringBeanThree();
//        SpringBeanThree springBeanThree2 = new SpringBeanThree();
//
//        return new SpringBeanTwo();
//    }
//
//    @Bean
//    public  SpringBeanThree springBeanThree(){
//        SpringBeanTwo springBeanTwo1 = new SpringBeanTwo();
//        SpringBeanTwo springBeanTwo2 = new SpringBeanTwo();
//
//        return new SpringBeanThree();
//    }

 // third pary libary ekkain apu ekakain claz ekka hadala Companet nethuwa bean ekka hadala wena claz ekaka ewa run karaganna oni nam
//    @Bean
//    public SpringBeanOne getSpringBeanOne(){
//        //bena ekak ethule thawa bean ekak invoke karanwata(call) dependancy ekaata api kiyyanwa interbean dependancy ekak (depenancy eka staisfy karaganna)
//        SpringBeanTwo springBeanTwo1 = getSpringBeanTwo();
//        SpringBeanTwo springBeanTwo2 = getSpringBeanTwo();
//        return new SpringBeanOne();
//    }
//
//    @Bean
//    public SpringBeanTwo getSpringBeanTwo(){
//        return new SpringBeanTwo();
//    }
}
