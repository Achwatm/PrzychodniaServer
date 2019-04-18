package com.example.demo.repository;

import com.example.demo.dao.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientsRepository extends  JpaRepository<Patients,Integer>  {

    @Query(value = "SELECT * FROM public.pacjenci",
            nativeQuery = true
    )
    List<Patients> showPatients();



}
