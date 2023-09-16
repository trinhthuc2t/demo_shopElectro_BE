package com.demo_shopelectro_be.controller;
import com.demo_shopelectro_be.model.order.OrderDetail;
import com.demo_shopelectro_be.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("/admin/orderDetail")
public class OrderDetailController {
    @Autowired
    private IOrderDetailService orderDetailService;
    @GetMapping
    public List<OrderDetail> getAll(){
        return orderDetailService.findAll();
    }
    @GetMapping("/{id}")
    List<OrderDetail> findByOderId(@PathVariable int id){
        return orderDetailService.findByOderId(id);
    }


}