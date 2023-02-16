package tipos;

public class Tipo {
	
	public static void main(String[] args) {

		{
			boolean correto = true;
			System.out.println(correto);
		}

		{
			byte minimo = Byte.MIN_VALUE;
			byte maximo = Byte.MAX_VALUE;
			System.out.println("Byte cabe de: " + minimo + " a " + maximo);
		}
		
		{
			short minimo = Short.MIN_VALUE;
			short maximo = Short.MAX_VALUE;
			System.out.println("Short cabe de: " + minimo + " a "+ maximo);
		}

		{
			int minimo = Integer.MIN_VALUE;
			int maximo = Integer.MAX_VALUE;
			System.out.println("Integer cabe de: " + minimo + " a "+ maximo);
		}

		{
			long minimo = Long.MIN_VALUE;
			long maximo = Long.MAX_VALUE;
			System.out.println("Long cabe de: " + minimo + " a "+ maximo);
		}

	}

}
