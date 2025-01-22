package lk.ecommerce;

import lk.ecommerce.bean.Boy;
import lk.ecommerce.config.AppConfig;
import lk.ecommerce.di.Test2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AppConfig.class);
        context.refresh();

//        Boy boy = context.getBean(Boy.class);
//        System.out.println(boy);
        Test2 test2 = context.getBean(Test2.class);
        test2.display();

//        boy.chatWithGirl();


        context.registerShutdownHook();
    }
}
