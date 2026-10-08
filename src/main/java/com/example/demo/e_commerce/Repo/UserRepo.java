package com.example.demo.e_commerce.Repo;

import com.example.demo.e_commerce.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<UserModel , Integer> {

}
