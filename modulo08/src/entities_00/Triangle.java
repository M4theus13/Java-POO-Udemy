package entities_00;

public class Triangle { //tipo triangle criado, contendo 3 informações A, B e C
	public double a;
	public double b;
	public double c;
	
	public double area() { //função criada para calcular a area do triangulo
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * ( p - a ) * ( p - b ) * ( p - c )); //retornara o resultado da expressão 
	}
}
