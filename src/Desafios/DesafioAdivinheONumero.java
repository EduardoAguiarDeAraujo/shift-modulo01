package Desafios;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinheONumero {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int chute;
		int x =  rnd.nextInt(100);
		
		System.out.println(x);
		
		do {
			System.out.println("Informe um valor: ");
			chute = sc.nextInt();
			if (chute < x) {
				System.out.println("MENOR");
			} else if (chute > x) {
				System.out.println("MAIOR");
			} else {
				System.out.println("Parabens voce acertou. O numero secreto era: " + x);
			}
			
		} while (x != chute);
		
		sc.close();
		
	}

}
