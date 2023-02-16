package Serializacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
	
	public static void main(String[] args) throws Exception {
		
		Vinho vinho = new Vinho();
		vinho.setNome("Malbec");
		vinho.setTipo("Tinto");
		vinho.setDescricao("Vinho feito com a uva malbec");
		
		FileOutputStream fOut = new FileOutputStream("C:\\Users\\Eduardo\\Documents\\vinho.ser");
		ObjectOutputStream oOut = new ObjectOutputStream(fOut);
		oOut.writeObject(vinho);
		oOut.close();
		System.out.println("Objeto serializado.");
		
	}

}
