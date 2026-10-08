package com.example.demo.e_commerce.Controller;


import com.example.demo.e_commerce.Model.UserModel;
import com.example.demo.e_commerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/products")
    public void allProducts() {

        List<UserModel> jobs = new ArrayList<>(Arrays.asList(
                new UserModel(1, "SG", "Bat brand"),
                new UserModel(2, "Acer", "Laptop Brand"),
                new UserModel(3, "Hp", "Desktop Brand")
        ));
        userService.getAllProduct(jobs);
    }

    @PostMapping("/products")
    public UserModel addProduct(@RequestBody UserModel user) {
        return userService.addProduct(user);
    }

    @PutMapping("/products")
    public UserModel updateProduct(@RequestBody UserModel user) {
        return userService.updateProduct(user);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {
        userService.deleteProduct(id);
        return "Product deleted successfully";
    }




}
