package Desafios;

import java.util.Scanner;

public class ExercicioDesvioEncadeado {
	
	/** 
	 * 	* Uma ONG resolveu prestar um serviço bem diferente: ela oferece vans para buscar pessoas com qualquer
	 *  * tipo de dificuldade de locomoção para poderem votar. 
	 *  * Para evitar problemas no momento do embarque,	  você foi convidado a criar um programa que valide a idade dos passageiros: 
	 *  * Caso tenham 16 anos ou menos, não podem votar (e nem embarcar). 
	 *  * Caso tenham entre 16 anos e 18 incompletos ou mais de 65 anos, podem optar por votar ou não. 
	 *  * Caso tenham entre 18 e 65 anos incompletos, devem votar obrigatoriamente. 
	 *  * Crie um programa que receba a idade dos passageiros em potencial e indique se podem embarcar e votar. */
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Byte idade;
		System.out.println("Por favor, digite a idade do passageiro.");
		idade = leitor.nextByte();
	
		if (idade < 16) {
			System.out.println("O passageiro nao pode embarcar e nao pode votar");
		} else if (idade >= 16 && idade < 18) {
			System.out.println("O passageiro pode embarcar e o voto eh opcional");
		} else if (idade>=18 && idade < 65) {
			System.out.println("O passageiro pode embarcar e o voto eh obrigatorio");
		} else {
			System.out.println("O passageiro pode embarcar e o voto eh opcional");
		}
		
		leitor.close();
		
	}
	

}
