package tipos;

public class Caractere {

	public static void main(String[] args) {

		{
			char valor = 'A';
			valor = (char) (valor + 1);
			System.out.println("Caractere: "+ valor);
		}

		{
			char valor = '\u0040';
			System.out.println("Caractere "+ valor);
		}

		{
			char valor = '\u0026';
			System.out.println("Caractere: "+ valor);
		}

		
	}
	
}
