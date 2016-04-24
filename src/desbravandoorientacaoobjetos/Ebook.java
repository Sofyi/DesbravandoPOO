package desbravandoorientacaoobjetos;

public class Ebook extends Livro{
	
	private String waterMark;

	public Ebook(Autor autor){
		super(autor);
	}
	
	//comportamentos unicos para um Ebook
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	@Override 
	public boolean aplicaDesconto(double porcentagem){
		if(porcentagem >0.15){
			return false;
		}
		return super.aplicaDesconto(porcentagem);
	}
	
}
