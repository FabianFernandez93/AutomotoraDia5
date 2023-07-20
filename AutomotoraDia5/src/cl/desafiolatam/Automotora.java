package cl.desafiolatam;

public class Automotora {

	public static void main(String[] args) {
		
		/*
		Taxi taxi1 = new Taxi("rojo","KFW-12",3000);
		System.out.println(taxi1.toString());
		//  ESTE METODO ES PARA EL PAGO DE PASAJE axi1.pagarPasaje();
		// TODO Auto-generated method stub
		Bus bus1 = new Bus("Buz ROJO","KFW-14",44);
		
		bus1.asientosDisponibles();
		MiniBus miniBus1 = new MiniBus(" Azul","KFW-13","VIAJE ESPECIAL",40);
		miniBus1.imprimeBus();
		System.out.println("- - - - - INFORMACION VENDEDOR - - - - -");
		Vendedor vendedor1 = new Vendedor("Ricardo","19.221.465-2",25,"avenida los peumos 2322");
		System.out.println(vendedor1);
		System.out.println("- - - - - INFORMACION TIENDA - - - - -");
		Tienda tienda1 = new Tienda(vendedor1,taxi1,bus1,miniBus1,150);
		tienda1.existeStock();
		System.out.println(tienda1.toString());
		
		*/
		//Hasta acá pude crear una tienda con su vendedor y un ejemplo de un vehiculo taxi1 previamente creado 
		//Lo cual a funcionado y se mantiene estable de momento
		
		Vehiculo autito3 = new Vehiculo("Rojos","KFsW-12");
		Cliente  clienta3 = new Cliente("Omara Constssreras","129.054.773-2",20);
		Vehiculo autito4 = new Vehiculo("Azuasdl","KFW-1ads3");
		Cliente  clienta4 = new Cliente("Lunsdadaa Contreras","19.011254.773-2",20);
		
		LibroVenta libroVenta3 = new LibroVenta("Chev223rolete","13-12-2311023");
		LibroVenta libroVenta4 = new LibroVenta("Spawwrk","14-12-202ada3");
		
		libroVenta3.guardarVenta(clienta3, autito3);
		libroVenta4.guardarVenta(clienta4, autito4);
		System.out.println("FIN");
	}

}
