package lk.ecommerce.z13_springboot.controller;

import lk.ecommerce.z13_springboot.dto.CustomerDTO;
import lk.ecommerce.z13_springboot.service.impl.CustomerServiceImpl;
import lk.ecommerce.z13_springboot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.List;

@CrossOrigin(origins = "http://localhost:63342")

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @PostMapping(path = "save")
    public ResponseUtil getCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.save(customerDTO);
//        System.out.println(customerDTO.getName());
//        return res;
//        if (res) {
//            return new ResponseUtil(201, "Customer is saved", null);
//
//        }return  new ResponseUtil(409, "alreday exist", null);
        return  new ResponseUtil(201, "Customer is saved", null);

    }

    @GetMapping("getAll")
    public ResponseUtil getAllCustomers() {
        return new ResponseUtil(
                200,
                "Customer List",
                customerService.getAll());
    }




    @PutMapping(path = "update")
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customerDTO){
         customerService.update(customerDTO);
         return  new ResponseUtil(200, "Customer update", null);

    }

    @DeleteMapping(path = "delete/{id}")
    public ResponseUtil deleteCustomer(@PathVariable int id){
        customerService.delete(id);
        return new ResponseUtil(200, "Customer deleted", null);
    }




}
