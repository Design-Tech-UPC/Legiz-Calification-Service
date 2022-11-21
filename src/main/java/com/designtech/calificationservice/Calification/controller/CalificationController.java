package com.designtech.calificationservice.Calification.controller;


import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.designtech.calificationservice.Calification.domain.model.Calification;
import com.designtech.calificationservice.Calification.domain.service.CalificationService;
import com.designtech.calificationservice.Calification.resource.CalificationResource;
import com.designtech.calificationservice.Calification.resource.SaveCalificationResource;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class CalificationController {

	@Autowired
	private CalificationService calificationService;
	
	
	@Autowired 
	private ModelMapper mapper;
	
	@Operation(summary="Make Calification", description="Make calification for lawyer", tags= {"califications"})
	@PostMapping("/calification_service/calification")
	public CalificationResource createCalification(
			@Valid @RequestBody SaveCalificationResource resource
			){
		log.info("resource {}",resource);
		return convertToResource(calificationService.makeCalification(convertToEntity(resource)));
	}
	
	@GetMapping("/calification_service/{lawyerId}")
	public float getCalificationFromLawyer(@PathVariable Long lawyerId)
	{
		return calificationService.getAverageOfCalification(lawyerId);
	}
	
	
	
	private Calification convertToEntity(SaveCalificationResource resource) {
		return mapper.map(resource, Calification.class);
	}
	
	private CalificationResource convertToResource(Calification entity) {
		return mapper.map(entity, CalificationResource.class);
	}
}
