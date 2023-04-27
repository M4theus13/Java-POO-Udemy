package util_exercicios;

public class Employees {
	private String name;
	private double salary;
	private int id;

	public Employees() {
	}
	
	public Employees(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}

