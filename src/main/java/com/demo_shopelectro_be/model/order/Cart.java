package com.demo_shopelectro_be.model.order;
import com.demo_shopelectro_be.model.product.Product;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Cart {
    private LocalDateTime dateTime;
    private double total;
    private List<Product> products;
    private int idAcc;

}
