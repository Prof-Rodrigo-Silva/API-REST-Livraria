package com.projetc.socialbooks.services.exceptions;

public class AutorExistenteException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1937644767862294687L;

	public AutorExistenteException(String mensagem) {
		super(mensagem);
		
	}
	
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
		
	}
	

}
