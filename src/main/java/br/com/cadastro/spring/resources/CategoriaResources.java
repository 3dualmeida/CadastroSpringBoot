package br.com.cadastro.spring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastro.spring.dominio.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listarCategorias() {
		
		Categoria categoria1 = new Categoria(1, "Informática");
		Categoria categoria2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(categoria1);
		lista.add(categoria2);
		
		return lista;
	}
	
}
