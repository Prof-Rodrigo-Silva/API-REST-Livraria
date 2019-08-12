package com.projetc.socialbooks.services.exceptions;

public class AutorNaoEncontradoException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1937644767862294687L;

	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);
		
	}
	
	public AutorNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
		
	}
	

}
