class Retangulo{

	public int altura;
	public int largura;

	public int CalcularArea(){
		return this.altura * this.largura;
	}

	public int CalcularPerimetro(){
		return this.largura * 2 + this.altura * 2;
	}
}