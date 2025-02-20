package lk.ecommerce.z13_springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Item {
    @Id
    private int idCode;
    private String name;
    public int quantity;
    public double price;

    public Item() {
    }

    public Item(String name, int idCode, int quantity, double price) {
        this.name = name;
        this.idCode = idCode;
        this.quantity = quantity;
        this.price = price;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return idCode == item.idCode && quantity == item.quantity && Double.compare(price, item.price) == 0 && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCode, name, quantity, price);
    }

    @Override
    public String toString() {
        return "Item{" +
                "idCode=" + idCode +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
