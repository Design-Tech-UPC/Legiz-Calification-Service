package com.designtech.calificationservice.Calification.resource;

import java.util.Date;

import com.designtech.calificationservice.Calification.domain.model.Calification.TipoServicio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CalificationResource {
	
	private Long idServicio;
    
    private TipoServicio tipoServicio;
    
    private Long idAbogado;

    private Long idCliente;
    
    private Integer puntuation;
    
    private Date createdAt;

    private Date updateAt;
}
