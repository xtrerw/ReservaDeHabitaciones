package ejercicio;

public class Cliente {
	private int numCliente;
	private String nombre;
	private int telefono;
	
	public Cliente (int num, String n, int t) {
		this.numCliente=num;
		this.nombre=n;
		this.telefono=t;
	}
	
	public int getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(
			int numCliente) {
		this.numCliente = numCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
