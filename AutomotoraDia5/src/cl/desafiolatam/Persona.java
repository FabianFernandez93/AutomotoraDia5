package cl.desafiolatam;

public class Persona {
	
	private String nombre;
	private String rut;
	private int edad;

	public Persona() {
		
	}
	public Persona (String nombre,String rut,int edad) {
		this.nombre=nombre;
		this.rut=rut;
		this.edad=edad;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + "]";
	}
	

}
