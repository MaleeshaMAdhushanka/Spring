package lk.ecommerce.controller;


import lk.ecommerce.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private  List<CustomerDTO> customers = new ArrayList<>();

    @PostMapping(path = "save")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        customers.add(customerDTO);
        return customerDTO;
    }

    @PutMapping("update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO){
        for (int i = 0; i < customers.size(); i++) {
            CustomerDTO exctingCustomer = customers.get(i);
            if (exctingCustomer.getId().equals(customerDTO.getId())){
               exctingCustomer.setName(customerDTO.getName());
               exctingCustomer.setAddress(customerDTO.getAddress());
               exctingCustomer.setAge(customerDTO.getAge());
               return exctingCustomer;

            }
        }
        return  customerDTO;
    }


    @GetMapping(path = "getAll")
    public List<CustomerDTO> getAllCustomer(){
        return customers;
    }

    @DeleteMapping(path = "delete/{id}")
    public boolean deleteCustomer(@PathVariable(value = "id") String id){

        for (int i = 0; i < customers.size(); i++) {
            CustomerDTO exitingCustomer = customers.get(i);
            if (exitingCustomer .getId().equals(id)){
                customers.remove(i);
                return true;

            }
        }
        System.out.println("id = " + id);


        return false;
    }
}
