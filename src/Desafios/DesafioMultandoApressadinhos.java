package Desafios;

import java.util.Scanner;

public class DesafioMultandoApressadinhos {
	
	public static void main(String[] args) {
		
		float velocidadeVia, velocidadeVeiculo, velocidadeMedia, velocidadeSoma, valorMulta, totalMultas, qtdeVeiculos, qtdeMultas;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a velocidade maxima permitida para a via: ");
		velocidadeVia = leitor.nextFloat();
		totalMultas = 0;
		qtdeMultas = 0;
		qtdeVeiculos = 0;
		velocidadeMedia = 0;
		velocidadeSoma = 0;
		
		do {
			System.out.println("Informe a velocidade do veiculo ou 0 para sair do sistema: ");
			velocidadeVeiculo = leitor.nextFloat();
			
			if (velocidadeVeiculo == 0) {
				break;
			}
			
			qtdeVeiculos += 1;
			velocidadeSoma += velocidadeVeiculo;

			if (velocidadeVeiculo > velocidadeVia) {
				if (velocidadeVeiculo - velocidadeVia > 30) {
					valorMulta = 300;
				} else if (velocidadeVeiculo - velocidadeVia > 10) {
					valorMulta = 100;
				} else {
					valorMulta = 50;
				}
				totalMultas += valorMulta;
				qtdeMultas += 1;
			} 
			
		} while (velocidadeVeiculo != 0);
		
		velocidadeMedia = velocidadeSoma/qtdeVeiculos;
		
		System.out.println("Velocidade media dos veiculos: " + velocidadeMedia);
		System.out.printf("Total de multas aplicadas de R$ %,.2f%n", totalMultas);
		System.out.println("Total de multas aplicadas: " + qtdeMultas);
		System.out.println("Percentual de carros multados: " + qtdeMultas/qtdeVeiculos * 100  + "%");
		
		leitor.close();
		
	}
	
	

}
