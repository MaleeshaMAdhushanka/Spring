package lk.ecommerce.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2 implements  DIInterface{

//    private  final DI test1;

//    @Autowired
    DI test1;
//
//    public  Test2() {
//        System.out.println("Test2 constructor");
//    }
//    @Autowired
//    public Test2(DI test1) {
//        this.test1 = test1;
////        System.out.println("Test2 constructor");
//    }

//@Autowired
//public  void setTest1(DI test1) {
//      this.test1 = test1;
//}
    public void  display() {
        test1.sayHello();
    }

@Autowired
    @Override
    public void inject(DI test1) {
        this.test1 = test1;
    }
}
