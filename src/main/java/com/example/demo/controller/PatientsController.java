package com.example.demo.controller;


import com.example.demo.dao.PatientCard;
import com.example.demo.dao.Patients;
import com.example.demo.dto.PatientDto;
import com.example.demo.repository.PatientCardRepository;
import com.example.demo.repository.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class PatientsController {


    final
    PatientsRepository patientsRepository;
    PatientCardRepository patientCardRepository;

    @Autowired
    public PatientsController(PatientsRepository patientsRepository) {
        this.patientsRepository = patientsRepository;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/showPatients",method = RequestMethod.GET)
    public List<Patients> getAll(){

        return patientsRepository.showPatients();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/addPatient",method = RequestMethod.POST)
    public ResponseEntity  addNewPatient(@RequestBody final PatientDto patientDto){
      Patients patient = new Patients(patientDto.getPesel(),patientDto.getAdres(),patientDto.getNrUbezpieczenia(),patientDto.getImie(),patientDto.getNrTelefonu(),patientDto.getNazwisko());
      System.out.println("pesel:"+patientDto.getPesel());
      patientsRepository.save(patient);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/showCard",method = RequestMethod.GET)
    public List<PatientCard> getCards(){

        return patientCardRepository.showCard();
    }

}
