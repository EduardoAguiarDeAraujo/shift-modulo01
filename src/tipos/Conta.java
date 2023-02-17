package Tipos;

import java.util.Scanner;

public class Conta {
	
	public static void main(String[] args) {
		
		float resultado = (float) 5/2;
		
		System.out.println("Resultado "+ resultado);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número A");
		float a = sc.nextFloat();
		
		System.out.println("Informe o número B");
		float b = sc.nextFloat();
		
		float res = a / b;
		
		System.out.println("Resultado = " + res);
		
		sc.close();
		
	}

}
