package com.example.demo.repository;

import com.example.demo.dao.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorsRepository extends JpaRepository<Doctor,Integer> {

    @Query(value = "SELECT * FROM public.lekarze",
            nativeQuery = true
    )
    List<Doctor> showDoctors();



}
