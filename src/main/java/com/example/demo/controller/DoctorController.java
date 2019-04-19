package com.example.demo.controller;


import com.example.demo.dao.Doctor;
import com.example.demo.dao.Patients;
import com.example.demo.dto.DoctorDto;
import com.example.demo.repository.DoctorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class DoctorController {


    final
    DoctorsRepository doctorRepository;


    @Autowired
    public DoctorController(DoctorsRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/showDoctors",method = RequestMethod.GET)
    public List<Doctor> getAll(){

        return doctorRepository.showDoctors();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/addDoctor",method = RequestMethod.POST)
    public ResponseEntity  addNewPatient(@RequestBody final DoctorDto doctorDto){
        Doctor doctor = new Doctor(doctorDto.getDoctorId(),doctorDto.getName(),doctorDto.getSurname(),doctorDto.getSpeciality(),doctorDto.getLicenseNumber(),doctorDto.getPhoneNumber());
        doctorRepository.save(doctor);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}