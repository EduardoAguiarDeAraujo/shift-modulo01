package Exceptions;


public class Conexao implements AutoCloseable{
	
	public Conexao() {
		System.out.println("Abrindo conexao");
	//	throw new IllegalStateException("Nao foi possivel criar a Conexao!!!");
	}
	
	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException("Falha de Conexao!!!");
	}
	
	public void fecha() {
		System.out.println("Fechando conexao");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Fecha Conexao");
		
	}

}
