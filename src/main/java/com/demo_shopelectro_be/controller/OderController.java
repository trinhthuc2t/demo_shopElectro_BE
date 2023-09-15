package com.demo_shopelectro_be.controller;

import com.demo_shopelectro_be.model.order.Cart;

import com.demo_shopelectro_be.model.order.Oder;
import com.demo_shopelectro_be.model.order.OrderDetail;
import com.demo_shopelectro_be.model.product.Product;
import com.demo_shopelectro_be.service.IAccountService;
import com.demo_shopelectro_be.service.IOrderDetailService;
import com.demo_shopelectro_be.service.impl.OderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("user/oder")
public class OderController {
    @Autowired
    OderService oderService;
    @Autowired
    IAccountService accountService;
    @Autowired
    IOrderDetailService orderDetailService;
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Cart cart){
        Oder oder =new Oder();
        oder.setDateTime(cart.getDateTime());
        oder.setTotal(cart.getTotal());
        oder.setAccount(accountService.findById(cart.getIdAcc()));
         oderService.save(oder) ;
        List<Product> products = cart.getProducts();
        for (Product p : products) {
            OrderDetail oderDetail = new OrderDetail();
            oderDetail.setOder(oder);
            oderDetail.setProduct(p);
            oderDetail.setQuantity(p.getQuantity());
            orderDetailService.save(oderDetail);
        }
return new ResponseEntity<>(HttpStatus.OK);

    }

}
