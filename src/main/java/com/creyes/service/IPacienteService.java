package com.creyes.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.creyes.model.Paciente;

public interface IPacienteService extends ICRUD<Paciente, Integer> {
	
	Page<Paciente> listarPageable(Pageable page);
	

}
