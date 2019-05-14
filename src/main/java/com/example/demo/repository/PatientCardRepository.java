package com.example.demo.repository;

import com.example.demo.dao.Doctor;
import com.example.demo.dao.PatientCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientCardRepository extends JpaRepository<PatientCard,Integer> {

    @Query(value = "SELECT * FROM public.karta_pacjenta",
            nativeQuery = true
    )
    List<PatientCard> showCard();



}
