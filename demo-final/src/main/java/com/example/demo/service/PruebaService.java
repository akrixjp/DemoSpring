package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Prueba;
import com.example.demo.repository.PruebaRepository;

@Service
public class PruebaService {

	@Autowired
	private PruebaRepository pruebaRepository;
	
	public List<Prueba> findListPrueba() throws Exception{
		return pruebaRepository.findAll();
	}
}
