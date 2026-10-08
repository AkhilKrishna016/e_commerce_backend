package com.example.demo.e_commerce.Service;

import com.example.demo.e_commerce.Controller.UserController;
import com.example.demo.e_commerce.Model.UserModel;
import com.example.demo.e_commerce.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void getAllProduct(List<UserModel> users) {
            userRepo.saveAll(users);
    }


    public UserModel addProduct(UserModel user) {
        return userRepo.save(user);
    }

    public UserModel updateProduct(UserModel user) {
        return userRepo.save(user);

    }

    public void deleteProduct(int id) {
        userRepo.deleteById(id);
    }
}

