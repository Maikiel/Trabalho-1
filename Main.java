class Main{
	
	public static void main(String args[]){

		Retangulo r = new Retangulo();
		r.altura = 6;
		r.largura = 12;

		System.out.println("Area do retangulo: " + r.CalcularArea());
		System.out.println("Perimetro do retangulo: " + r.CalcularPerimetro());
	 }
}
