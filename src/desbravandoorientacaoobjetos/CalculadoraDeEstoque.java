package desbravandoorientacaoobjetos;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {
		double soma=0;
		int cont=0;
		while(cont<35){
			double valorDoLivro=59.90;
			soma +=  valorDoLivro;
			cont++;
		}
		System.out.println("Total em estoque: "+soma);
		
		if(soma<150){
			System.out.println("Estoque muito baixo");
		}else if(soma >=2000){
			System.out.println("Estoque muito alto");
		}else{
			System.out.println("Estoque bom");
		}
	}

}
