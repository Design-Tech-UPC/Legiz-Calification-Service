package com.designtech.calificationservice.Calification.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.designtech.calificationservice.Calification.domain.model.Calification;
import com.designtech.calificationservice.Calification.domain.repository.CalificationRepository;
import com.designtech.calificationservice.Calification.domain.service.CalificationService;
import com.designtech.calificationservice.External.service.LegizClient;
import com.designtech.calificationservice.External.service.LegizLawyer;
import com.designtech.calificationservice.External.service.LegizLegalConsult;
import com.designtech.calificationservice.External.service.LegizLegalContract;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CalificationServiceImpl implements CalificationService {


	private final LegizClient legizClient;

	private final LegizLawyer legizLawyer;

	private final LegizLegalConsult legizLegalConsult;


	private final LegizLegalContract legizLegalContract;


	private final CalificationRepository calificationRepository;


	@Override
	public Calification makeCalification(
			Calification calification) {
		Date date = new Date();  
		calification.setCreatedAt(date);
		calification.setUpdateAt(date);
		return calificationRepository.save(calification);
	}

	@Override
	public float getAverageOfCalification(Long LawyerId) {
		float calificaciOnLoka = calificationRepository.getAverageCalificationFromLawyer(LawyerId);
		return calificaciOnLoka;
	}

}
