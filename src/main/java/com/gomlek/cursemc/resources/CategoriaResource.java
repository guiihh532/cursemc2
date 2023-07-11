package com.gomlek.cursemc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gomlek.cursemc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	//obtem um dado do metodo
	@GetMapping
	public List<Categoria> listar() {
		
		
		Categoria cat = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> list = new ArrayList<>();
		
		list.add(cat);
		list.add(cat2);
				
				
		return list;
	}
}
