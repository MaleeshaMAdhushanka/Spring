package lk.ecommerce.z13_springboot.service;

import lk.ecommerce.z13_springboot.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    public void save(CustomerDTO customerDTO);
    public List<CustomerDTO> getAll();
    public void update(CustomerDTO customerDTO);
    public void delete(int id);
}
