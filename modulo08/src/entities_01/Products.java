package entities_01;

public class Products {
	private String name;
	private double price;
	private int quantity;
	
	public Products (String name, double price, int quantity) {//construtor
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Products (String name, double price) {//construtor
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public int getQuantity(int quantity) {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { 
		return 
		name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
		/* toString converte um objeto para palavra, porem a palavra q ira retornar sera o valor do objeto
		exemplo (entities.Products@7c75222b) para fazer com que vire uma string, cria se uma PUBLIC STRING SUBSTITUINDO o comando padra
		que tera o RETURN definido de escolha
		neste caso esta retornando "name, price quantity e totalValueInStock"
		
		String.format("%.2f", price) comando para formatar uma palavra, exemplo price para %.2f
		  
		 */
	}
}
