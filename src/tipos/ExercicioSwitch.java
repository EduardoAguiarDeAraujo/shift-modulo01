package tipos;

import java.util.Random;
import java.util.Scanner;

public class ExercicioSwitch {
	
	public static void main(String[] args) {
		
		Byte elogio;
		String nome;
		Scanner leitor = new Scanner(System.in);

		String nomePrograma = """
				-------------------------------------------------
				                Programa de Elogio
				-------------------------------------------------
				""";

		System.out.println(nomePrograma);
		
		System.out.println("Qual o seu nome?");
		
		nome = leitor.next();
		
		Random r = new Random();
		
		System.out.println("Selecione uma das opcoes abaixo:");
		System.out.println("1 - Elogio profissional");
		System.out.println("2 - Elogio fisico");
		System.out.println("3 - Elogio pessoal");
		
		elogio = leitor.nextByte();
		
		switch (elogio) {
			case 1:
				System.out.println("Excelente trabalho "+ nome +", parabens!");
				break;
			case 2:
				System.out.println(nome +", voceh estah super bem de saude");
				break;
			case 3:
				System.out.println(nome + " voceh eh muito inteligente");
				break;
			default:
				System.out.println("selecione uma das opcoes");
		}
		
		var msg = "";
		
		switch (elogio) {
		
			case 1 -> msg = r.nextInt(0, 2) == 0 ? "a sua dedicacao eh incrivel":"eh otimo trabalhar ao seu lado!";
			
			case 2 -> msg = r.nextInt(0, 2) == 0 ? "voce eh uma pessoa muito forte":"o brilho dos seus olhos me encanta";
			
			case 3 -> msg = r.nextInt(0, 2) == 0 ? "voce eh uma pessoa muito altruista":"sua bondade me inspira a ser uma pessoa melhor.";
			
			default -> {
				System.out.println("Opcao invalida.");
				System.exit(0);
			}
			
		}
		
		System.out.println(nome +", "+ msg);
		
		leitor.close();
		
	}

}
