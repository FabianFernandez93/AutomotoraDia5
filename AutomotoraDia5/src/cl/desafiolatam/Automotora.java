package cl.desafiolatam;

public class Automotora {

	public static void main(String[] args) {
		
		
		Taxi taxi1 = new Taxi("rojo","KFW-12",3000);
		System.out.println(taxi1.toString());
		taxi1.pagarPasaje();
		// TODO Auto-generated method stub
		Bus bus1 = new Bus("Buz ROJO","KFW-14",44);
		
		bus1.asientosDisponibles();
		MiniBus miniBus1 = new MiniBus(" Azul","KFW-13","VIAJE ESPECIAL",40);
		miniBus1.imprimeBus();
		System.out.println("- - - - - INFORMACION VENDEDOR - - - - -");
		Vendedor vendedor1 = new Vendedor("Ricardo","19.221.465-2","avenida los peumos 2322");
		System.out.println(vendedor1);
		System.out.println("- - - - - INFORMACION TIENDA - - - - -");
		Tienda tienda1 = new Tienda(vendedor1,taxi1,bus1,miniBus1,150);
		tienda1.existeStock();
		System.out.println(tienda1.toString());
		//Hasta acá pude crear una tienda con su vendedor y un ejemplo de un vehiculo taxi1 previamente creado 
		//Lo cual a funcionado y se mantiene estable de momento
	}

}
