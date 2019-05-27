package com.example.demo.controller;


import com.example.demo.dao.Appointment;
import com.example.demo.dao.PatientCard;
import com.example.demo.dao.Patients;
import com.example.demo.dto.AppointmentDto;
import com.example.demo.dto.PatientCardDto;
import com.example.demo.dto.PatientDto;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.PatientCardRepository;
import com.example.demo.repository.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;


@RestController
public class PatientsController {


    final
    PatientsRepository patientsRepository;
    PatientCardRepository patientCardRepository;
    AppointmentRepository appointmentRepository;
    @Autowired
    public PatientsController(PatientsRepository patientsRepository, PatientCardRepository patientCardRepository, AppointmentRepository appointmentRepository) {
        this.patientsRepository = patientsRepository;
        this.patientCardRepository = patientCardRepository;
        this.appointmentRepository = appointmentRepository;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/showPatients",method = RequestMethod.GET)
    public List<Patients> getAll(){

        return patientsRepository.showPatients();
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/showPatientCard/{pesel}",method = RequestMethod.GET)
    public List<PatientCard> getPatientCard(@PathVariable Long pesel) {
        List<PatientCard> card = new ArrayList<>();

        int i = 0;
        boolean confirm=false;
        for (PatientCard patientCard : patientCardRepository.showCard()) {
            if (patientCard.getPesel().equals(pesel)) {
              confirm= true;
              card.add(patientCard);
            }
            i++;
        }
        if(confirm){
            return card;
        }
        else{
            return null;
        }
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

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/addRegistry",method = RequestMethod.POST)
    public ResponseEntity  addRegistry(@RequestBody final PatientCardDto patientCardDto){
        PatientCard card = new PatientCard(patientCardDto.getPesel(),patientCardDto.getVisit(),patientCardDto.getRecom(),patientCardDto.getDoctorId());
        System.out.println("pesel:"+patientCardDto.getPesel());
        patientCardRepository.save(card);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value ="/makeAppointment",method = RequestMethod.POST)
    public ResponseEntity  makeAppointment(@RequestBody final AppointmentDto appointmentDto){
        System.out.println(appointmentDto.getTime());
        Appointment appointment = new Appointment(appointmentDto.getPesel(), appointmentDto.getDate(), appointmentDto.getTime(),appointmentDto.getDoctorId());
        System.out.println("pesel:"+appointmentDto.getTime());
        appointmentRepository.save(appointment);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
