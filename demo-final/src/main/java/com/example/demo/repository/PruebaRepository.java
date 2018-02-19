package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Prueba;

public interface PruebaRepository extends CrudRepository<Prueba, Integer> {

	Prueba findByNombre(String nombre); 
	List<Prueba> findAll();
}
