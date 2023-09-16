package com.demo_shopelectro_be.controller;

import com.demo_shopelectro_be.model.account.Account;
import com.demo_shopelectro_be.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/accounts")

public class AccountController {
    @Autowired
    IAccountService accountService;
    @Autowired
    HttpSession session;

    @GetMapping("/admin")
    public List<Account> getAll() {
        return accountService.findAll();
    }


    @PostMapping
    public Account save(@RequestBody Account account) {
        return accountService.save(account);
    }


    @GetMapping("/admin/delete/{id}")
    public void delete(@PathVariable int id) {
        accountService.delete(id);
    }

    @GetMapping("/{id}")
    public Account edit(@PathVariable int id) {
        return accountService.findById(id);

    }

//    @GetMapping("/search")
//    public List<Account> search(@RequestParam String name) {
//        return (List<Account>) accountService.findByUsername(name);
//    }
    @GetMapping("/admin/search/{name}")
    List<Account> findByUsernameContaining(@PathVariable String name){
        return accountService.findByUsernameContaining(name);
    }


//    @PostMapping("/login")
//    public Account login(@RequestParam String username, @RequestParam String password) {
//        Account account = accountService.login(username, password);
//        if (account != null) {
//            // Đăng nhập thành công, lưu thông tin phiên làm việc của người dùng trong session
//            session.setAttribute("account", account);
//            return account;
//        } else {
//            return null;
//
//        }
//    }
}
