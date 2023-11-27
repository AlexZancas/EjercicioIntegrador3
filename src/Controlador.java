import java.time.LocalDateTime;
import java.util.ArrayList;
import static java.time.temporal.ChronoUnit.DAYS;

public class Controlador {
	double gananciaBruta;
	double gananciaNeta;
	double perdidaProyectada;
	long difDias;
	ArrayList <Modelo> listaModelos;
	Vista vista;
	
	public Controlador (Vista vista) {
		this.vista = vista;
	}
	
	public void addModelo () {
		Modelo modelo = this.vista.createModelo();
		listaModelos.add(modelo);
		calcGananciaBruta();
		calcGananciaNeta();
		calcPerdida();
		calcDiffDias(modelo);
	}
	
	public void showInfo() {
		vista.showFinancieroInfo(this.gananciaBruta, this.gananciaNeta, this.perdidaProyectada, this.difDias);
	}
	
	public Vista getVista() {
		return vista;
	}

	public void setVista(Vista vista) {
		this.vista = vista;
	}

	public double getGananciaBruta() {
		return gananciaBruta;
	}

	public void setGananciaBruta(double gananciaBruta) {
		this.gananciaBruta = gananciaBruta;
	}

	public double getGananciaNeta() {
		return gananciaNeta;
	}

	public void setGananciaNeta(double gananciaNeta) {
		this.gananciaNeta = gananciaNeta;
	}

	public double getPerdidaProyectada() {
		return perdidaProyectada;
	}

	public void setPerdidaProyectada(double perdidaProyectada) {
		this.perdidaProyectada = perdidaProyectada;
	}
	
	public long getDifDias() {
		return difDias;
	}

	public void setDifDias(long difDias) {
		this.difDias = difDias;
	}

	public ArrayList<Modelo> getListaModelos() {
		return listaModelos;
	}

	public void setListaModelos(ArrayList<Modelo> listaModelos) {
		this.listaModelos = listaModelos;
	}

	public void calcGananciaBruta() {
		int unidadesVendidas = 0;
		for(int i=0; i<this.listaModelos.size(); i++) {
			unidadesVendidas = this.listaModelos.get(i).getUnidadesVendidas();
		}
		this.gananciaBruta = unidadesVendidas;
	}
	
	public void calcGananciaNeta() {
		this.gananciaNeta = this.gananciaBruta*0.83;
	}
	
	public void calcPerdida() {
		this.perdidaProyectada = this.gananciaNeta / 12;
	}
	
	public void calcDiffDias(Modelo modelo) {
		this.difDias = DAYS.between(modelo.getFechaElaboracion(), modelo.getFechaVencimiento());
	}
}
