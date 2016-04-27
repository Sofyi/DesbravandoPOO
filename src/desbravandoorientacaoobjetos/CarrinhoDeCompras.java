package desbravandoorientacaoobjetos;

public class CarrinhoDeCompras {
	private double total;
	
	
	public double getTotal() {
		return total;
	}
	
	public void adiciona(Livro livro){
		System.out.println("Adicionado: "+livro);
		livro.aplicaDesconto(0.05);
		total+=livro.getValor();
	}
}
