package lk.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@RequestMapping("test")

public class textController {
    //Handler method, Mapping method
    @GetMapping
    public String text(){
        return "test";
    }
}
