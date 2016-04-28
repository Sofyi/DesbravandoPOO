package desbravandoorientacaoobjetos;

//import java.util.ArrayList;

public class CarrinhoDeCompras {
	private double total;
	//ArrayList<Livro> lista = new ArrayList<Livro>();
	//public static int cont;
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total){
		this.total+=total;
	}
	public void adiciona(Livro livro){
		System.out.println("Adicionado\n"+livro);
		livro.aplicaDescontoDe(0.05);
		setTotal(livro.getValor());
		//this.lista.add(livro);
		//cont++;		
	}
	public void adiciona(Produto produto){
		System.out.println("Adicionando\n"+produto);
		setTotal(produto.getValor());
	}
}
