package com.api.controllers;

import com.api.dto.UserDTO;
import com.api.entities.User;
import com.api.helpers.MappingHelper;
import com.api.repositories.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/getById/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable int id) {
        User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("No such User with id " + id));
        return ResponseEntity.ok(mapToDTO(user, UserDTO.class));
    }

    @GetMapping("/getResponsableMail")
    public String getResponsableMail() {
        User user = userRepo.findByRole("responsable").orElseThrow(() -> new RuntimeException("No such User with role = responsable"));
        return user.getMail();
    }


    @Override
    public ModelMapper getMappingModelMapper() {
        return new ModelMapper();
    }

    @Override
    public ModelMapper getUnMappingModelMapper() {
        return null;
    }
}
