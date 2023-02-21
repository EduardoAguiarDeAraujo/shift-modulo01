package Desafios;

public class TecnicaDasDivisoesComLimitador {


    public static boolean isPrime(long dividendo) {

        //sabemos que o primeiro número primitivo é 2. Vamos eliminar as possibilidades contrárias a esta verdade.
        if (dividendo < 2) return false;

        //O Limitador é o quociente ser maior que o divisor.
        //Repete-se enquanto o divisor for menor ou igual ao quociente.
        for (long divisor = 2, quociente = dividendo / divisor; divisor <= quociente; divisor++) {
            //Se o resto for ZERO, não é primo
            if (dividendo % divisor == 0) return false;
        }
        return true;
    }

	
}
