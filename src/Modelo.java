import java.time.LocalDate;
import java.time.LocalDateTime;

public class Modelo extends Thread{
	String detalle;
	String color;
	double peso;
	double precio;
	int unidadesVendidas;
	LocalDate fechaElaboracion;
	LocalDate fechaVencimiento;
	
	public Modelo() {}
	
	public Modelo(String detalle, String color, double peso, double precio, LocalDate fechaElaboracion,
			LocalDate fechaVencimiento, int unidadesVendidas) {
		this.detalle = detalle;
		this.color = color;
		this.peso = peso;
		this.precio = precio;
		this.unidadesVendidas = unidadesVendidas;
		this.fechaElaboracion = fechaElaboracion;
		this.fechaVencimiento = fechaVencimiento;
	
	}
	
	
	
	public int getUnidadesVendidas() {
		return unidadesVendidas;
	}

	public void setUnidadesVendidas(int unidadesVendidas) {
		this.unidadesVendidas = unidadesVendidas;
	}

	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public LocalDate getFechaElaboracion() {
		return fechaElaboracion;
	}
	public void setFechaElaboracion(LocalDate fechaElaboracion) {
		this.fechaElaboracion = fechaElaboracion;
	}
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
}
