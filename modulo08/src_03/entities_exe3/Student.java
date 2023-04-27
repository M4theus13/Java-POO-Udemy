package entities_exe3;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double mediaFinal() {
		return nota1 + nota2 + nota3;
	}
	public double failed() {
		if (mediaFinal() < 60.0) {
		return 60.0 - mediaFinal();
		}
		else {
			return 0.0;	
		}
	}		
}
