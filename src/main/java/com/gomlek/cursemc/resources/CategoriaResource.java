package com.gomlek.cursemc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	//obtem um dado do metodo
	@GetMapping
	public String listar() {
		return "REST esta funcionando";
	}
}
