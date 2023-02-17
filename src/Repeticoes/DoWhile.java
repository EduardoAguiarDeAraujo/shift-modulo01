package Repeticoes;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int op;
		
		do {
			System.out.println("Cadastrei!");
			System.out.println("Deseja continuar? 1 - SIM; 2 - NAO");
			op = leitor.nextInt();
		} while (op == 1);
		
		leitor.close();
		
		int i = 0;
		
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
		
	}

}
