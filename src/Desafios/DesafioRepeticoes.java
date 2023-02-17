package Desafios;

import java.util.Scanner;

/*************************************************************************************************************
 * 
 * Crie um programa em Java que capture notas de alunos (um a um) e, ao final, imprima no console a nota média.
 *  
 * ***********************************************************************************************************/

public class DesafioRepeticoes {
	
	public static void main(String[] args) {
		
		int i, op;
		long nota, soma, media;
		
		Scanner leitor = new Scanner(System.in);
		
		i = 0;
		soma = 0;
		
		do {
			System.out.println("Entre com a nota do aluno: ");
			nota = leitor.nextLong();
			soma += nota;
			i++;
			System.out.println("Deseja cadastrar mais um aluno? 1 - Sim; 2 - Nao");
			op = leitor.nextInt();
			
		} while (op == 1);
		
		media = soma/i;
		
		System.out.println("A media da turma eh: " + media);
		
		leitor.close();
		
	}

}
