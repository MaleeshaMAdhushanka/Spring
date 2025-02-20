package lk.ecommerce.z13_springboot.service;

import lk.ecommerce.z13_springboot.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    public void addItem(ItemDTO itemDTO);
    public void deleteItem(int id);
    public void updateItem(ItemDTO itemDTO);
    public List<ItemDTO> getAllItems();
}
