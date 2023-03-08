package ejercicio;

public class Reserva {
	private int numReserva;
	private String fechaEntrada;
	private String fechaSalida;
	private int numPersona;
	private Habitacion habitacion;
	private Cliente cliente;
	
	public Reserva(int nR,String fE,String fS, int nP, Habitacion h, Cliente c) {
		this.numReserva=nR;
		this.fechaEntrada=fE;
		this.fechaSalida=fS;
		this.habitacion=h;
		this.cliente=c;
	}
	
	public int getNumReserva() {
		return numReserva;
	}
	public void setNumReserva(
			int numReserva) {
		this.numReserva = numReserva;
	}
	public String getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(
			String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(
			String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public int getNumPersona() {
		return numPersona;
	}
	public void setNumPersona(
			int numPersona) {
		this.numPersona = numPersona;
	}
	public Habitacion getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(
			Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(
			Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
