package lk.ecommerce.controller;

import lk.ecommerce.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("form")
public class FormDataController {

//    @PostMapping
//    public String test1(@RequestParam (value ="id") String id,
//                        @RequestParam (value ="name") String name){
//        return id + " " + name;
//    }

    //req wwws url data tika object ekata dganna eka
    //loku object ekka gaththoth expand wechcha data tikkak ewanwa nama Using model attribute
    @PostMapping
    public String test1 (@ModelAttribute CustomerDTO customerDTO){
        System.out.println(customerDTO.getFirstName());
        return customerDTO.toString();
    }
}
