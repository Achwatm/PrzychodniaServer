package com.example.demo.controller;


import com.example.demo.dao.Users;
import com.example.demo.dto.UsersDto;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UsersController {


    final
    UsersRepository usersRepository;

    @Autowired
    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/show",method = RequestMethod.GET)
    public List<Users> getAll(){

        return usersRepository.showUsers();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/add",method = RequestMethod.POST)
    public ResponseEntity  addNewUser(@RequestBody final UsersDto usersDto){
        Users user = new Users(usersDto.getPesel(),usersDto.getPassword(),usersDto.getRole());
        System.out.println("pesel:"+usersDto.getPesel());
        usersRepository.save(user);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
