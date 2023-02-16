package tipos;

import java.util.Scanner;

public class DesafioAnoBissexto {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Programa para verificar se um ano é bissexto");
		System.out.println("Informe o ano: ");
		var ano = leitor.nextInt();
		
		boolean bissexto = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 !=0);
		
		String msg = bissexto ? " eh " : " nao eh ";
		
		System.out.println(ano + msg + "bissexto!");
		
		leitor.close();
		
	}

}
