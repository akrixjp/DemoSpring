package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.*;
import com.example.demo.service.PruebaService;

@RestController
public class PruebaRestController {

	@Autowired
	private PruebaService pruebaService;
	
	@GetMapping("/saludo")
	public String HelloWorld(){
		return "Hello World!";
	}
	
	@GetMapping("/prueba")
	public Prueba Prueba(){
		Prueba p = new Prueba();
		p.setNombre("Jorge");
		p.setDetalle("Jorge");
		
		return p;
	}
	
	//primera subida
	
	@GetMapping("/pruebas")
	public List<Prueba> getListado() {
		List<Prueba> p1 = new ArrayList<>();
		try {
		
			p1= this.pruebaService.findListPrueba();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return p1;
	}
	 
	
}
