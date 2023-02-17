package Repeticoes;

import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean repete = true;
		
		while (repete) {
			System.out.println("Repetindo");
			System.out.println("Deseja continuar?");
			repete = sc.nextBoolean();
		}
		
		sc.close();

		int i = 0;
		
		while (i<=100) {
			System.out.println(i);
			i++;
		}
	}


}
