package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class TesteCollectionEqualsHashCode {
    public static void main(String[] args) {

        System.out.println("""
        		--------------------------------------------------
        		Com a implementacao dos metodos HashCode e Equals
        		--------------------------------------------------
        		""");
        
    	Set<Produto> produtos = new HashSet<>();
        produtos.add(new Produto(1, "Caderno 96 folhas"));
        produtos.add(new Produto(2, "Lapis 2B"));
        produtos.add(new Produto(3, "Borracha"));
        produtos.add(new Produto(4, "Estojo"));

        Produto p = new Produto(4, "Estojo");
        System.out.println("Produto: " + p);
        System.out.println("HashCode: " + p.hashCode());
        System.out.println("Existe o produto na colecao? " + produtos.contains(p));
        System.out.println();
        for (Produto produto : produtos) {
        	System.out.println(produto.getIdProduto() +" - "+ produto.getNomeProduto() +"; Equals = "+ produto.equals(p)+"; HashCode = "+ produto.hashCode());
		}
        
        System.out.println("""
        		
        		-------------------------------------------------
        		Sem a implementacao dos metodos HashCode e Equals
        		-------------------------------------------------
        		""");
        Set<Pedido> pedidos = new HashSet<>();
        pedidos.add(new Pedido(1,"Eduardo"));
        pedidos.add(new Pedido(2,"Katia"));
        pedidos.add(new Pedido(3,"Rebeca"));
        
        Pedido p1 = new Pedido(3,"Rebeca");
        
        System.out.println("Pedido: " + p1);
        System.out.println("HashCode: " + p1.hashCode());
        System.out.println("Existe o pedido na colecao? " + pedidos.contains(p1));
        
        for (Pedido pedido : pedidos) {
			System.out.println(pedido.getId() +"-"+pedido.getNome()+"; Equals = "+ pedido.equals(p1)+"; HashCode = "+ pedido.hashCode());
		}
    }
}