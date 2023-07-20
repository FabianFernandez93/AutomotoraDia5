package cl.desafiolatam;
import java.io.*;

/*
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
*/

public class LibroVenta {

		private String nombreVenta;
		private String fechaVenta;
		
		public LibroVenta () {
			
		}
		public LibroVenta(String nombreVenta,String fechaVenta) {
			super();
			this.setNombreVenta(nombreVenta);
			this.setFechaVenta(fechaVenta);
		}
		public String getNombreVenta() {
			return nombreVenta;
		}
		public void setNombreVenta(String nombreVenta) {
			this.nombreVenta = nombreVenta;
		}
		public String getFechaVenta() {
			return fechaVenta;
		}
		public void setFechaVenta(String fechaVenta) {
			this.fechaVenta = fechaVenta;
		}
				@Override
		public String toString() {
			return "LibroVenta [nombreVenta=" + nombreVenta + ", fechaVenta=" + fechaVenta + "]";
		}
				
		public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
			
			String nombreDirectorio = "ficheros";			
			String fichero = getNombreVenta();
			
			File directorio = new File("src/" + nombreDirectorio);
			
			File archivo = new File ("src/" + nombreDirectorio + "/" + fichero);
			
			try {
				
				if(directorio.exists() == false) {
					
					if(directorio.exists()) {
						if(directorio.mkdirs()) {
							System.out.println("Directorio creado");
							try {
								
								//int fecha = Integer.parseInt(getFechaVenta());
								String fecha = getFechaVenta();
								FileWriter writer = new FileWriter(archivo);
							    archivo.createNewFile();
							    BufferedWriter buffer = new BufferedWriter(writer);
							    buffer.write(vehiculo.getPatente() + "\n");
							    buffer.write(cliente.getEdad() + "\n");
							    buffer.write(fecha + "\n");
							    buffer.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
						} else {
							System.out.println("Error al crear directorio");
						}
					} else {
						System.out.println("Directorio ya esta creado");
					}
				}
			} catch (NumberFormatException e) {
				throw new NumberFormatException(e.getMessage());
			}
	}
}
