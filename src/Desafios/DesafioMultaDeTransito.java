package Desafios;

import java.util.Scanner;

public class DesafioMultaDeTransito {
	
	public static void main(String[] args) {
		
		float via, veiculo, multa;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a velocidade máxima permitida para a via: ");
		via = leitor.nextFloat();
		
		System.out.println("Informe a velocidade do veículo: ");
		veiculo = leitor.nextFloat();
		
		if (veiculo > via) {
			if (veiculo - via > 30) {
				multa = 300;
			} else if (veiculo - via > 10) {
				multa = 100;
			} else {
				multa = 50;
			}
			System.out.printf("Multa aplicada de R$ %,.2f%n", multa);
			System.out.println("Motivo: Trafegar com velocidade superior à permitida.");
		} else {
			System.out.println("Motorista prodente!");
		}
		
		leitor.close();
		
	}

}
