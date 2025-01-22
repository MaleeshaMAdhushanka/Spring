package lk.ecommerce.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
//    @Autowired
//    Girl girl;
@Qualifier("girl1")
//using beaan Id
@Autowired
    Agreement girl;
    //Object eka mekata initialize wela nh
//    ethalota e part eka kare Autowired annotation eka

    public Boy(){
        System.out.println("Boy Constructor");
    }
    public void chatWithGirl() {
//        Girl girl = new Girl();
        girl.chat();

    }

}

//Tightly Coupled loosely coupled