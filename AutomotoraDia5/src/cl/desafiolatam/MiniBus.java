package cl.desafiolatam;

public class MiniBus extends Bus{
	private String tipoViaje;
	
	public MiniBus() {
		}

	public MiniBus(String color,String patente,String tipoViaje,int cantidadAsientos) {
		super(color,patente,cantidadAsientos);
		this.tipoViaje=tipoViaje;
	}
	public void imprimeBus() {
		System.out.println("- - - - Informacion MiniBus - - - - - -\n");
        System.out.println("Color: " + getColor());
        System.out.println("Patente: " + getPatente());
        System.out.println("Cantidad de asientos: " + getCantidadAsientos());
        System.out.println("Tipo de viaje: " + tipoViaje);
    }

	public String getTipoViaje() {
		return tipoViaje;
	}
	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}
	@Override
	public String toString() {
		return "MiniBus [tipoViaje=" + tipoViaje + ", getCantidadAsientos()=" + getCantidadAsientos() + ", getColor()="
				+ getColor() + ", getPatente()=" + getPatente() + "]";
	}
	
	

}
