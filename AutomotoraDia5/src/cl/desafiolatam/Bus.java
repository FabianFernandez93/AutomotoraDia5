package cl.desafiolatam;

public class Bus extends Vehiculo{
	private int cantidadAsientos;
	
	public Bus() {
		}
	
	public Bus(String color,String patente,int cantidadAsientos) {
		super(color,patente);
		this.cantidadAsientos=cantidadAsientos;
	}
	
	public void asientosDisponibles() {
		System.out.println("- - - - - - Informacion BUS - - - - - - -\n");
		System.out.println("Cantidad de asientos Disponibles: " + cantidadAsientos+"\n");
	}
	public int getCantidadAsientos() {
		return cantidadAsientos;
	}
	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}
	@Override
	public String toString() {
		return "Bus [cantidadAsientos=" + cantidadAsientos + ", getColor()=" + getColor() + ", getPatente()="
				+ getPatente() + "]";
	}
	
	

}
