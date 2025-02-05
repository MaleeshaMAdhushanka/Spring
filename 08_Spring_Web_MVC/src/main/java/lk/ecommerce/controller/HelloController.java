package lk.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//project eka ethulema thiye nam controll eka
//nethnm rest eka
//@RestController
@Controller
//- view ruturns
@RequestMapping("/hello")
public class HelloController {
    public HelloController(){
        System.out.println("Hello Controller");
    }
    @GetMapping
    public String Hello(){
//        return "Hello world";
        return "index";
    }
}
