package lk.ecommerce.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//primary annotation eka dala thiyena ekkana dependancy widiyata inject karaganne kiyala.
public class Girl1 implements Agreement{
    public Girl1() {
        System.out.println("Girl Constructor");
    }

    @Override
    public void chat() {
        System.out.println("girl 1 Chatting....");
    }
    //    public void chat(){
//        System.out.println("Chatting....");
//    }
}
