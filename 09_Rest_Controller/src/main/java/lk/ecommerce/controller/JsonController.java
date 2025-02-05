package lk.ecommerce.controller;

import lk.ecommerce.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JsonController {

    @PostMapping
    public  String test1(@RequestBody CustomerDTO customerDTO){
        return customerDTO.getFirstName();
    }
    //return karana eka mark down kara
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDTO test2(){
        return new CustomerDTO("Maleesha", "Madushanka", 24);
    }

    @GetMapping(path = "data", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<CustomerDTO> test3(){
        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
        customerDTOS.add(new CustomerDTO("Maleesha", "Madushanka", 24));
        customerDTOS.add(new CustomerDTO("Maleesha", "Madushanka", 24));
        customerDTOS.add(new CustomerDTO("Maleesha", "Madushanka", 24));
        return customerDTOS;
    }
}
