package Desafios;

import java.time.Duration;
import java.time.Instant;

import javax.swing.JOptionPane;

public class DesafioNumerosPrimos {
	
    public static void main(String[] args) {


        long numero = Long.parseLong(

                JOptionPane.showInputDialog(
                        """
                                    Informe a quantidade de números - de zero até ele - que deseja verificar se é primo.
                                                            
                                    Por exemplo; ao digitar o número 5, o resultado será:
                                                            
                                    [ 2 ] [ 3 ] [ 5 ]
                                                        
                                """
                )
        );


        byte tecnica = Byte.parseByte(

                JOptionPane.showInputDialog(
                        """
                                                        
                                    Qual a técnica que deseja utilizar?
                                                    
                                    1 - Divisões sucessivas
                                    2 - Divisões sucessivas com limitador
                                    3 - Quatro passos
                                    4 - Crivo de Eratóstenes.
                                                
                                """
                )
        );


        switch (tecnica) {
            case 1 -> tecnicaUm(numero);
            case 2 -> tecnicaDois(numero);
            case 3 -> tecnicaTres(numero);
            case 4 -> tecnicaQuatro(numero);
            default -> System.out.println("Aceitamos somente números 1 ou 2");
        }

    }


    public static void tecnicaUm(long numero) {
        {
            long contador = 0;
            Instant inicio = Instant.now();
            while (contador <= numero) {
                if (TecnicaDasDivisoes.isPrime(contador)) {
                    System.out.print("[ " + contador + " ]");
                }
                contador++;
            }
            System.out.println("\nTempo Total: " + Duration.between(inicio, Instant.now()).toMillis());
        }
    }


    public static void tecnicaDois(long numero) {
        long contador = 0;
        Instant inicio = Instant.now();
        while (contador <= numero) {
            if (TecnicaDasDivisoesComLimitador.isPrime(contador)) {
                System.out.print("[ " + contador + " ]");
            }
            contador++;
        }
        System.out.println("\nTempo Total: " + Duration.between(inicio, Instant.now()).toMillis());
    }

    public static void tecnicaTres(long numero) {
        long contador = 0;
        Instant inicio = Instant.now();
        while (contador <= numero) {
            if (TecnicaDosQuatroPrimeiros.isPrime(contador)) {
                System.out.print("[ " + contador + " ]");
            }
            contador++;
        }
        System.out.println("\nTempo Total: " + Duration.between(inicio, Instant.now()).toMillis());
    }

    public static void tecnicaQuatro(long numero) {
        long contador = 0;
        Instant inicio = Instant.now();
        while (contador <= numero) {
            if (TecnicaDoCrivoDeEratostenes.isPrime(contador)) {
                System.out.print("[ " + contador + " ]");
            }
            contador++;
        }
        System.out.println("\nTempo Total: " + Duration.between(inicio, Instant.now()).toMillis());
    }

}
