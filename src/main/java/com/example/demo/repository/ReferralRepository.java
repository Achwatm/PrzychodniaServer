package com.example.demo.repository;

import com.example.demo.dao.Doctor;
import com.example.demo.dao.Referral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReferralRepository extends JpaRepository<Referral,Integer> {

    @Query(value = "SELECT * FROM public.skierowania",
            nativeQuery = true
    )
    List<Referral> showReferrals();
}