package com.project.socialbooks.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.socialbooks.domain.Livro;

@RestController
public class LivrosResources {
	
	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public List<Livro> listar (){
		
		Livro l1 = new Livro("RESTfull");
		Livro l2 = new Livro("PHP Avançado");
		Livro l3 = new Livro("JAVA WEB");
		
		Livro[] livros = {l1, l2,l3};
		
		return Arrays.asList(livros);
	}

}
