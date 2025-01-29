package lk.ecommerce.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//using run wena welawe value ekka daganna oni nam @Value annotation eka use karanna
@Component
public class SpringBean implements InitializingBean {

    @Value("Maleesha")
    private String name;

    public SpringBean() {
        System.out.println(name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }
//    public SpringBean(){}
//Argument wedima constructor eka thama ganne
    //Prameter count eka weidma eka use kranne

//    @Autowired(required = false)
//    //menna meka daganna kiyala run time ekedi
//    public SpringBean(@Value("Maleesha") String name,
//                      @Value("1") int id) {
//
//        System.out.println("Spring Bean Object Created");
//        System.out.println("Name: " + name);
//        System.out.println("ID: " + id);
//    }
//
//    @Autowired(required = false)
//    public SpringBean(@Value("Maleesha") String name,
//                      @Value("1") int id,
//                      @Value("true") boolean b) {
//
//        System.out.println("Spring Bean Object Created");
//        System.out.println("Name: " + name);
//        System.out.println("ID: " + id);
//        System.out.println("b: " + b);
//    }
}



