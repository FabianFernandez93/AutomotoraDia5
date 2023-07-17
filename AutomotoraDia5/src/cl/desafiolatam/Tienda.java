package cl.desafiolatam;

public class Tienda {
	
	public Vendedor vendedor;
	public Cliente cliente;
	public Vehiculo taxi;
	public Vehiculo bus;
	public Vehiculo miniBus;
	int stock;
	
	public Tienda () {
			}
	public Tienda(Vendedor vendedor,Taxi taxi,Bus bus,MiniBus miniBus, int stock) {
			this.vendedor=vendedor;
			this.taxi=taxi;
			this.bus=bus;
			this.miniBus=miniBus;
			this.stock=stock;
	}
	public void existeStock() {
		System.out.println("La cantidad de stock de la tienda es: "+ stock);
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vehiculo getTaxi() {
		return taxi;
	}
	public void setTaxi(Vehiculo taxi) {
		this.taxi = taxi;
	}
	public Vehiculo getBus() {
		return bus;
	}
	public void setBus(Vehiculo bus) {
		this.bus = bus;
	}
	public Vehiculo getMiniBus() {
		return miniBus;
	}
	public void setMiniBus(Vehiculo miniBus) {
		this.miniBus = miniBus;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Tienda \n" + vendedor + "\n- taxi= " + taxi + "\n- bus= " + bus + "\n- miniBus= " + miniBus + "\n- stock= "
				+ stock + "]";
	}
	
	

}
