package lk.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

///
@RestController
@RequestMapping("one")
public class wildCardMappingOptionOne {

    //one /test/*/hello medata onama value ekka gannawa
    //one /test//hello
    //one /test/asfddda/hello/asasda

//    @GetMapping("test/*/hello")
@GetMapping("test/*/*")
public String test(){
        return "Get Mapping Option One";
    }
}
