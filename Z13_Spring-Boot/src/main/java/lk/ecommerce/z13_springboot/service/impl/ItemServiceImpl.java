package lk.ecommerce.z13_springboot.service.impl;

import lk.ecommerce.z13_springboot.dto.ItemDTO;
import lk.ecommerce.z13_springboot.entity.Item;
import lk.ecommerce.z13_springboot.repo.ItemRepo;
import lk.ecommerce.z13_springboot.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void addItem(ItemDTO itemDTO) {
        if (itemRepo.existsById(itemDTO.getIdCode())) {
            throw  new RuntimeException("Iteam alredy exists");
        }
        itemRepo.save(modelMapper.map(itemDTO, Item.class));
    }
    @Override
    public void deleteItem(int id) {
        itemRepo.deleteById((id));
    }
    @Override
    public void updateItem(ItemDTO itemDTO) {
        if (itemRepo.existsById(itemDTO.getIdCode())){
            itemRepo.save(modelMapper.map(itemDTO, Item.class));

        }
        throw  new RuntimeException("Item does not exit");

    }
    @Override
    public List<ItemDTO> getAllItems() {
        return modelMapper.map(itemRepo.findAll(), new TypeToken<List<ItemDTO>>(){}.getType());
    }




}
