package cl.desafiolatam;

public class Cliente {
	
	int edad;
	
	public Cliente () {
		}
	public Cliente (int edad) {
		this.edad=edad;
		}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Cliente [edad=" + edad + "]";
	}
	

}
