package Colecoes;

public class Produto {
    private int idProduto;
    private String nomeProduto;

    public Produto(int idProduto, String nomeProduto) {
        super();
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
    }

    public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + "]";
	}

	@Override
    public int hashCode() {
        return this.idProduto;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Produto)) return false; 

        if(obj == this) return true;

        Produto produto = (Produto) obj; 

        return this.idProduto == produto.getIdProduto() && this.nomeProduto.equals(produto.getNomeProduto());
    }   
    
    
}