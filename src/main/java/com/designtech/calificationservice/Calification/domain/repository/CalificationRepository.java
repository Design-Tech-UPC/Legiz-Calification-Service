package com.designtech.calificationservice.Calification.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.designtech.calificationservice.Calification.domain.model.Calification;

@Repository
public interface CalificationRepository extends JpaRepository<Calification, Long>{
	/*
    Page<Calification> findByClientId(Long ClientId, Pageable pageable);
    Page<Calification> findByLawyerId(Long LawyerId, Pageable pageable);
    Page<Calification> findByLegalContractId(Long LegalContractId, Pageable pageable);
    Page<Calification> findByLegalConsult(Long LegalConsultId, Pageable pageable);
    */
    @Query("SELECT AVG(c.puntuation) FROM Calification c WHERE c.idAbogado = ?1") 
    float getAverageCalificationFromLawyer(Long LawyerId);
}
