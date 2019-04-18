package com.example.demo.service;

import com.example.demo.dao.Patients;
import com.example.demo.dto.PatientDto;
import com.example.demo.repository.PatientsRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public interface PatientsService   {




    public void addNewPatient(PatientDto patient);



}
