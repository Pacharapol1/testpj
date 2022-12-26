package com.example.demo.model.controller;

import com.example.demo.model.bean.APIReponse;
import com.example.demo.model.service.UserRepository;
import com.example.demo.model.table.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController


public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/alluser")
    public Object alluser(User user){
        userRepository.findAll();
        return userRepository.findAll();
    }

    @PostMapping("/register")
    public Object register(User user){
        APIReponse reponse = new APIReponse();

        userRepository.save(user);


        System.out.println(user);
        reponse.setStatus(1);
        reponse.setMessage("OK!");
        reponse.setData(user.getUsername());
        return  reponse;
    }

//    @PostMapping("/tregister")
//    public Object tregister(User teacher) {
//        APIReponse res= new APIReponse();
//        try {
//            User teacher = UserRepository.findByuser();
//            if (teacher == null){
//                userRepository.save(teacher);
//                res.setStatus(1);
//                res.setMassage("success");
//            }
//            else {
//                res.setStatus(0);
//                res.setMassage("error");
//            }
//
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        return res;
//    }

}
