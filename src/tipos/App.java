package tipos;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello World!!!");
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Boa noite " + nome);
		scanner.close();
		
	}

}
