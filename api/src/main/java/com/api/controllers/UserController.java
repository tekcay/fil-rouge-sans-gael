package com.api.controllers;

import com.api.dto.UserDTO;
import com.api.entities.User;
import com.api.helpers.MappingHelper;
import com.api.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user-controller")
public class UserController implements MappingHelper<UserDTO, User> {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/createUser")
    public boolean createResponsable(@RequestBody UserDTO userDTO) {
        userRepo.save(unMapDTO(userDTO, User.class));
        return true;
    }


    @GetMapping("/getResponsableMail")
    public String getResponsableMail() {
        return userRepo.findByRole("responsable").getMail();
    }


}
