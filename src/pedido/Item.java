package pedido;

public class Item {
	private int quantidade;
	private double preco;
	
	private Produto produto;

	public Item() {
	}

	public Item(int quantidade, double preco) {
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double subTotal() {
		return quantidade * preco;
	}

	@Override
	public String toString() {
		return produto.getName()
				+ ", $"
				+String.format("%.2f", preco)
				+ ", Quantidade: "
				+ quantidade
				+", Subtotal: $" 
				+ String.format("%.2f", subTotal());		
	}

}
