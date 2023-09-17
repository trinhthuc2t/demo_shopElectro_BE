package com.demo_shopelectro_be.controller;

import com.demo_shopelectro_be.model.account.Account;
import com.demo_shopelectro_be.model.account.Role;
import com.demo_shopelectro_be.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/accounts")

public class AccountController {
    @Autowired
    IAccountService accountService;

    @Value("${upload.profile.path}")
    private String fileUpload;
    @GetMapping("/admin")
    public List<Account> getAll() {
        return accountService.findAll();
    }


    @PostMapping
    public ResponseEntity<String> save(@RequestParam ("file")MultipartFile file,
                                       @RequestParam (value = "username") String username,
                                       @RequestParam (value = "password") String password,
                                       @RequestParam (value = "fullName") String fullName,
                                       @RequestParam (value = "phone") String phone,
                                       @RequestParam (value = "address") String address
                        ) throws IOException {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(password); // mã hóa code
        String fileName = file.getOriginalFilename();
        String filePath = fileUpload + "/" + fileName;
        File imageFile = new File(filePath);
        if (!imageFile.exists()){
            file.transferTo(imageFile);
        }
        Account account = new Account(username,encodedPassword,fullName,phone,address);
        Role role =new Role();
        role.setId(1);
        account.setRole(role);
        account.setImg(fileName);
        accountService.save(account);
        return new ResponseEntity<>("create success" , HttpStatus.OK);
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
