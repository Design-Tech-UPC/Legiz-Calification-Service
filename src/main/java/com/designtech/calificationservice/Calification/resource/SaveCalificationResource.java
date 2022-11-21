package com.designtech.calificationservice.Calification.resource;


import com.designtech.calificationservice.Calification.domain.model.Calification.TipoServicio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SaveCalificationResource {
	
	
	private Long idServicio;
    
    private TipoServicio tipoServicio;
    
    private Long idAbogado;

    private Long idCliente;
    
    private Integer puntuation;
    
    

}
