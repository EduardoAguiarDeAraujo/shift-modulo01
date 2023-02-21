package Desafios;

public class TecnicaDasDivisoes {
	
    public static boolean isPrime(long dividendo) {
        if (dividendo <= 1) {
            return false;
        }
        for (int divisor = 2; divisor < dividendo; divisor++) {
            if (dividendo % divisor == 0) {
                return false;
            }
        }
        return true;
    }

}
