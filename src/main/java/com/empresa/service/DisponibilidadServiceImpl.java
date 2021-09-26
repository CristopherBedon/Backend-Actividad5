package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Disponibilidad;
import com.empresa.repository.DisponibilidadRepository;

@Service
public class DisponibilidadServiceImpl implements DisponibilidadService {

	@Autowired
	private DisponibilidadRepository repository;

	@Override
	public Disponibilidad insertaActualizaDisponibilidad(Disponibilidad obj) {
		return repository.save(obj);
	}

	@Override
	public List<Disponibilidad> listaDisponibilidad() {
		return repository.findAll();
	}

	
	
}
