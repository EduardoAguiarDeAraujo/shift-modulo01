package tipos;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		{
			var x = 2;
			x +=10;
			System.out.println("X = "+ x);
		}

		{
			var x = 2;
			x -=10;
			System.out.println("X = "+ x);
		}

		{
			var x = 2;
			x *=10;
			System.out.println("X = "+ x);
		}

		{
			var x = 2.0;
			x /=10;
			System.out.println("X = "+ x);
		}

		{
			var x = 2;
			x %=10;
			System.out.println("X = "+ x);
		}

		{
			var x = 10;
			x %=2;
			System.out.println("X = "+ x);
		}
		
	}

}
