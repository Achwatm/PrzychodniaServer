package com.example.demo.repository;

import com.example.demo.dao.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecepcionistRepository extends JpaRepository<Receptionist,Integer> {

    @Query(value = "SELECT * FROM public.recepcjonisci",
            nativeQuery = true
    )
    List<Receptionist> showRecepcjonists();
}