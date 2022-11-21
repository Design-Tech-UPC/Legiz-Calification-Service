package com.designtech.calificationservice.Calification.domain.service;

import com.designtech.calificationservice.Calification.domain.model.Calification;
import com.designtech.calificationservice.Calification.domain.model.Calification.TipoServicio;

public interface CalificationService {
	Calification makeCalification(Calification calification);
	float getAverageOfCalification(Long lawyerId);
}
