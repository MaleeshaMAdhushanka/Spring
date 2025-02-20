package lk.ecommerce.z13_springboot.controller;

import lk.ecommerce.z13_springboot.dto.ItemDTO;
import lk.ecommerce.z13_springboot.service.impl.ItemServiceImpl;
import lk.ecommerce.z13_springboot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:63342")
@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    @Autowired
    private ItemServiceImpl itemService;

    @PostMapping(path = "save")
    public ResponseUtil saveItem(@RequestBody ItemDTO itemDTO) {
         itemService.addItem(itemDTO);
         return  new ResponseUtil(200, "Item saved", null);

    }

    @GetMapping(path = "getAll")
    public ResponseUtil getAllItems() {
        return new  ResponseUtil(200, "GetAll Items", itemService.getAllItems());

    }

    @PutMapping(path = "update")
    public ResponseUtil updateItem(@RequestBody ItemDTO itemDTO) {
         itemService.updateItem(itemDTO);
         return  new ResponseUtil(200,"Item Updated", null);
    }

    @DeleteMapping(path = "delete/{id}")
    public ResponseUtil deleteItem(@PathVariable("id") int id) {
        itemService.deleteItem(id);
        return new ResponseUtil(200 ,"Item Deleted", null);
    }


}
