package Exceptions;

/**************************************************
* RuntimeException: não obriga a tratar o erro
* Exception: obriga o tratamento do erro  
*************************************************/
public class BusinessException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public BusinessException(String msg) {
		super(msg);
	}
	

}
