package com.example.demo.controller;

import com.example.demo.dao.Appointment;
import com.example.demo.repository.AppointmentRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReceptionistController {
AppointmentRepository appointmentRepository;

    public ReceptionistController(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/showAppointments",method = RequestMethod.GET)
    public List<Appointment> getAppointments(){
        return appointmentRepository.showAppointments();
    }
}
