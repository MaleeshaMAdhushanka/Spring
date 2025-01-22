package lk.ecommerce;

import lk.ecommerce.bean.SpringBean;
import lk.ecommerce.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer2 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AppConfig.class);
        context.refresh();

        SpringBean bean1 = context.getBean(SpringBean.class);
        SpringBean bean2 = context.getBean(SpringBean.class);

        System.out.println(bean1);
        System.out.println(bean2);
        context.registerShutdownHook();

    }
}