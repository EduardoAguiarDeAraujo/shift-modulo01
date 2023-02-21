package Exceptions;


public class Conta {

	public void deposita() throws MinhaExcecaoChecked {
		
		throw new MinhaExcecaoChecked("Erro: nao foi possivel realizar o deposito.");
		
	}
}
