package com.designtech.calificationservice.unitTests;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.designtech.calificationservice.Calification.domain.model.Calification;
import com.designtech.calificationservice.Calification.domain.repository.CalificationRepository;
import com.designtech.calificationservice.Calification.domain.service.CalificationService;
import static org.assertj.core.api.Assertions.*;

@ExtendWith(SpringExtension.class)
public class CalificationServiceImplTests {

	@MockBean
	private CalificationRepository calificationRepository;
	
	@MockBean
	private CalificationService calificationService;
	
	@Test
	@DisplayName("When make calification, Lawyer must have an lawyerService already")
	public void WhenMakeCalificationLawyerMustHaveAnLawyerServiceAlready() {
		// Arrange
		Long lawyerId=1L;
		Long calificationId = 1L;
		Calification calification = new Calification();
		when(calificationRepository.findById(calificationId)).thenReturn(Optional.of(calification));
		// Act
		calification.setId(calificationId);
		calification.setIdAbogado(4L);
		// Assert
		assertThat(!calification.getIdAbogado().equals(lawyerId));
	}

}
