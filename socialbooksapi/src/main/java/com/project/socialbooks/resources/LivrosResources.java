package com.project.socialbooks.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.socialbooks.domain.Livro;
import com.project.socialbooks.repository.LivrosRepository;

@RestController
public class LivrosResources {
	
	
	@Autowired
	private LivrosRepository livrosRepository;
	
	@RequestMapping(value = "/livro", method = RequestMethod.GET)
	public List<Livro> listar (){
		
		return livrosRepository.findAll();
	}

}
