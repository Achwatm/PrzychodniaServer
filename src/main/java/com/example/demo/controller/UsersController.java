package com.example.demo.controller;


import com.example.demo.dao.DoctorRole;
import com.example.demo.dao.Receptionist;
import com.example.demo.dao.Users;
import com.example.demo.dto.DoctorRoleDto;
import com.example.demo.dto.ReceptionistDto;
import com.example.demo.dto.UsersDto;
import com.example.demo.repository.DoctorRoleRepository;
import com.example.demo.repository.RecepcionistRepository;
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
    DoctorRoleRepository doctorRoleRepository;
    RecepcionistRepository recepcionistRepository;

    @Autowired
    public UsersController(UsersRepository usersRepository, DoctorRoleRepository doctorRoleRepository, RecepcionistRepository recepcionistRepository) {
        this.usersRepository = usersRepository;
        this.doctorRoleRepository = doctorRoleRepository;
        this.recepcionistRepository = recepcionistRepository;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/show",method = RequestMethod.GET)
    public List<Users> getAll(){
        return usersRepository.showUsers();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/addUser",method = RequestMethod.POST)
    public ResponseEntity  addNewUser(@RequestBody final UsersDto usersDto){
        Users user = new Users(usersDto.getPesel(),usersDto.getPassword(),"user");
        System.out.println("pesel:"+usersDto.getPesel());
        usersRepository.save(user);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/login",method = RequestMethod.POST)
    public ResponseEntity  login(@RequestBody final UsersDto usersDto) {
        Users user = new Users(usersDto.getPesel(), usersDto.getPassword(), usersDto.getRole());
        System.out.println(usersDto.getPassword());
        System.out.println(usersDto.getPesel());
        System.out.println(usersDto.getRole());
boolean confirm=false;
        for (Users users : usersRepository.showUsers()) {
            if (users.getPesel().equals(user.getPesel())&& users.getPassword().equals(user.getPassword())&& users.getRole().equals(user.getRole())) {
                System.out.println(users.getPesel().equals(user.getPesel()));
                System.out.println(users.getPassword().equals(user.getPassword()));
                System.out.println(users.getRole().equals(user.getRole()));

                confirm=true;
            }
        }
        if(confirm){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/doctorLogin",method = RequestMethod.POST)
    public ResponseEntity  doctorLogin(@RequestBody final DoctorRoleDto usersDto) {
        System.out.println(usersDto.getPesel());
        DoctorRole doctor = new DoctorRole(usersDto.getPesel(), usersDto.getPassword());
        System.out.println(doctor.getPesel());
        System.out.println(doctor.getPassword());
        boolean confirm=false;
        for (DoctorRole doctors : doctorRoleRepository.showDoctors()) {
            System.out.println(doctor.getPesel().equals(doctors.getPesel()));
            if (doctors.getPesel().equals(doctor.getPesel())&& doctors.getPassword().equals(doctor.getPassword())) {
                System.out.println("Działa");
                confirm=true;
            }
        }
        if(confirm){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/receptionistLogin",method = RequestMethod.POST)
    public ResponseEntity  receptionistLogin(@RequestBody final ReceptionistDto receptionistDto) {
        System.out.println(receptionistDto.getPesel());
        Receptionist receptionist = new Receptionist(receptionistDto.getPesel(), receptionistDto.getPassword());
        boolean confirm=false;
        for (Receptionist receptionists : recepcionistRepository.showRecepcjonists()) {
            if (receptionists.getPesel().equals(receptionist.getPesel())&& receptionists.getPassword().equals(receptionist.getPassword())) {
                System.out.println("Działa");
                confirm=true;
            }
        }
        if(confirm){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }


}
