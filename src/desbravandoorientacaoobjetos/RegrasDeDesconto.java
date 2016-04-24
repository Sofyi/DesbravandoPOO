package desbravandoorientacaoobjetos;

public class RegrasDeDesconto {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Sofia");
		
		Livro livro = new Livro(autor);
		livro.setValor(59.90);
		
		System.out.println("Valor atual: "+livro.getValor());
		System.out.println("\nImpresso");
		if(!livro.aplicaDesconto(0.3)){
			System.out.println("Desconto nao pode ser maior do que 30%");
		}else{
			System.out.println("Valor com desconto: R$"+livro.getValor());
		}
		
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		System.out.println("\nEbook");
		if(!ebook.aplicaDesconto(0.15)){
			System.out.println("Desconto nao pode ser maior que 15%");
		}else{
			System.out.println("Valor do Ebook com desconto: R$"+ebook.getValor());
		}
	}
}
