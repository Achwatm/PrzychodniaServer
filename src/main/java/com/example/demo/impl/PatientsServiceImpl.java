package com.example.demo.impl;

import com.example.demo.dao.Patients;
import com.example.demo.dto.PatientDto;
import com.example.demo.repository.PatientsRepository;
import com.example.demo.service.PatientsService;
import org.modelmapper.ModelMapper;

public class PatientsServiceImpl implements PatientsService {

    final private PatientsRepository patientsRepository;

    public PatientsServiceImpl(PatientsRepository patientsRepository) {
        this.patientsRepository = patientsRepository;
    }

    @Override
    public void addNewPatient(PatientDto patient) {
        ModelMapper modelMapper = new ModelMapper();
        Patients newPatient = modelMapper.map(patient, Patients.class);
        patientsRepository.save(newPatient);
    }
}
