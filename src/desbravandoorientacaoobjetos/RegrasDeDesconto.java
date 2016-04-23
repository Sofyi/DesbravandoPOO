package desbravandoorientacaoobjetos;

public class RegrasDeDesconto {
	public static void main(String[] args) {
		Autor autor = new Autor();
		Livro livro = new Livro(autor);
		livro.setValor(59.90);
		
		System.out.println("Valor atual: "+livro.getValor());
		if(!livro.aplicaDesconto(0.4)){
			System.out.println("Desconto nao pode ser maior do que 30%");
		}else{
			System.out.println("Valor com desconto: "+livro.getValor());
		}
	}
}
