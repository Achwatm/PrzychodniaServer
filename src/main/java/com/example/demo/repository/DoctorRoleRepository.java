package com.example.demo.repository;

import com.example.demo.dao.Doctor;
import com.example.demo.dao.DoctorRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRoleRepository extends JpaRepository<DoctorRole,Integer> {

    @Query(value = "SELECT * FROM public.doctor_role",
            nativeQuery = true
    )
    List<DoctorRole> showDoctors();

}