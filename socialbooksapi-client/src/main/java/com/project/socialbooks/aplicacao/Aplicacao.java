package com.project.socialbooks.aplicacao;

import java.text.SimpleDateFormat;
import java.util.List;

import com.project.socialbooks.client.LivrosClient;
import com.project.socialbooks.client.domain.Livro;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Aplicacao {
	
	public static void main(String[] args) throws ParseException, Exception{

		LivrosClient cliente = new LivrosClient();
		
		List<Livro> listaLivros = cliente.listar();
	
		
		
		for (Livro livro : listaLivros) {
			System.out.println("Livro: "+livro.getNome());
		}
		Livro livro = new Livro();
		livro.setNome("Android");
		livro.setEditora("LEB");
		
		SimpleDateFormat publicacao = new SimpleDateFormat("dd/MM/yyyy");
		livro.setPublicacao(publicacao.parse("21/08/2019"));
		
		livro.setResumo("PHP Avançado");
		
		String localizacao = cliente.salvar(livro);
		
		System.out.println("URI do livro salvo: "+ localizacao);
		
	}

}
