package Tipos;
import java.util.Scanner;

public class AppEscola {
	
	public static void main(String[] args) {
		
		float ps, tcc, av1, av2, mediaNecessaria = 7;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a nota da prova semestral: ");
		ps = sc.nextFloat(); 

		System.out.println("Informe a nota da trabalho final: ");
		tcc = sc.nextFloat(); 

		System.out.println("Informe a nota da avaliação 1: ");
		av1 = sc.nextFloat(); 

		System.out.println("Informe a nota da avaliação 2: ");
		av2 = sc.nextFloat(); 
		
		double mediaFinal = ps * 0.5 + tcc * 0.3 + ((av1 + av2)/2) * 0.2;
		
		System.out.println("Média Final: " + mediaFinal);
		
		if (mediaFinal >= mediaNecessaria) {
			System.out.println("Aluno aprovado! :)");
		} else if (mediaFinal >=5) {
			System.out.println("Aluno em exame :/");
		} else {
			System.out.println("Aluno reprovado :(");
		}
		
		sc.close();
		
	}

}
