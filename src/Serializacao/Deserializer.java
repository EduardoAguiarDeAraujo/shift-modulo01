package Serializacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializer {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fOut = new FileInputStream("C:\\Users\\Eduardo\\Documents\\vinho.ser");
		ObjectInputStream oOut = new ObjectInputStream(fOut);
		Vinho vinho = (Vinho) oOut.readObject();
		oOut.close();
		System.out.println(vinho);
		System.out.println("Objeto deserializado");
		
	}

}
