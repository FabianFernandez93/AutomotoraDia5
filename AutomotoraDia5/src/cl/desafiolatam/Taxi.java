package cl.desafiolatam;

import java.util.Scanner;

public class Taxi extends Vehiculo{
	
	private int valorPasaje;
	
	public Taxi (String color,String patente,int valorPasaje) {
		super(color,patente);
		this.valorPasaje=valorPasaje;
	}
	public Taxi() {
	}
	
	public void pagarPasaje() {
		int pagado;
		int vuelto;
		valorPasaje = 3000 ;
		Scanner costoPasaje = new Scanner (System.in);
		System.out.println("------------PAGAR PASAJE-------");
		System.out.println("con cuanto Paga? (costo pasaje $3.000)  "); 
		pagado = costoPasaje.nextInt() ;
		while (pagado < 3000 ) {
			System.out.println("Valor insuficiente favor de pagar el minimo de $3.000");
			pagado = costoPasaje.nextInt() ;
		}
		vuelto = pagado - 3000;
		System.out.println("Gracias por Preferirnos\n su vuelto es: "+ vuelto);
		costoPasaje.close();
	}

	public int getValorPasaje() {
		return valorPasaje;
	}
	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}
	@Override
	public String toString() {
		return "Taxi [valorPasaje=" + valorPasaje + ", getColor()=" + getColor() + ", getPatente()=" + getPatente()
				+ "]";
	}
	

}
