package com.example.demo.controller;


import com.example.demo.dao.Doctor;
import com.example.demo.dao.Referral;
import com.example.demo.dto.DoctorDto;
import com.example.demo.dto.ReferralDto;
import com.example.demo.repository.DoctorsRepository;
import com.example.demo.repository.ReferralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class DoctorController {


    final
    DoctorsRepository doctorRepository;
    ReferralRepository referralRepository;

    @Autowired
    public DoctorController(DoctorsRepository doctorRepository, ReferralRepository referralRepository) {
        this.doctorRepository = doctorRepository;
        this.referralRepository = referralRepository;
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

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/addReferral",method = RequestMethod.POST)
    public ResponseEntity  addReferral(@RequestBody final ReferralDto referralDto){
        Referral referral = new Referral(referralDto.getPesel(),referralDto.getTypeOfTest(),referralDto.getDate(),referralDto.getDoctorId());
        System.out.println("pesel:"+referralDto.getPesel());
        referralRepository.save(referral);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}