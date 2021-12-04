package com.filipesouza.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.filipesouza.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> list() {
		
		Categoria  cat1 = new Categoria(1, "informatica");
		Categoria  cat2 = new Categoria(2, "Escritorio");
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		
		categorias.add(cat1);
		categorias.add(cat2);
		
		return categorias;	
	}

}
