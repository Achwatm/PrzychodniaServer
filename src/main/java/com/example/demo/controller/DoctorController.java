package com.example.demo.controller;


import com.example.demo.dao.Appointment;
import com.example.demo.dao.Doctor;
import com.example.demo.dao.Referral;
import com.example.demo.dto.DoctorDto;
import com.example.demo.dto.ReferralDto;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.DoctorsRepository;
import com.example.demo.repository.ReferralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class DoctorController {


    final
    DoctorsRepository doctorRepository;
    ReferralRepository referralRepository;
    AppointmentRepository appointmentRepository;

    @Autowired
    public DoctorController(DoctorsRepository doctorRepository, ReferralRepository referralRepository, AppointmentRepository appointmentRepository) {
        this.doctorRepository = doctorRepository;
        this.referralRepository = referralRepository;
        this.appointmentRepository = appointmentRepository;
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/showDoctors",method = RequestMethod.GET)
    public List<Doctor> getAll(){

        return doctorRepository.showDoctors();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/addDoctor",method = RequestMethod.POST)
    public ResponseEntity  addNewPatient(@RequestBody final DoctorDto doctorDto){
        Doctor doctor = new Doctor(doctorDto.getDoctorId(),doctorDto.getName(),doctorDto.getSurname(), doctorDto.getLicenseNumber(),doctorDto.getPhoneNumber());
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

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/showAppointments/{doctorId}",method = RequestMethod.GET)
    public List<Appointment> getAppointments(@PathVariable Integer doctorId){

        List<Appointment> appointments = new ArrayList<>();

        int i = 0;
        boolean confirm=false;
        for (Appointment appointment : appointmentRepository.showAppointments()) {
            if (appointment.getDoctorId().equals(doctorId)) {
                confirm= true;
                appointments.add(appointment);
            }
            i++;
        }
        if(confirm){
            return appointments;
        }
        else{
            return null;
        }
    }

}