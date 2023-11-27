import java.time.LocalDate;
import java.util.Scanner;

public class Vista {
	public Modelo createModelo() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el detalle del pedido:");
		String detalle = scanner.nextLine();
		
		System.out.println("Ingresa el color del pedido:");
		String color =  scanner.nextLine();
		
		System.out.println("Peso del pedido:");
		double peso =  scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Precio del pedido:");
		double precio = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Unidades vendidas:");
		int unidades = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Día del mes de elaboracion:");
		int diaE = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Mes de elaboracion(numero) :");
		int mesE = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Año de elaboracion:");
		int añoE = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Día del mes de vencimiento:");
		int diaV = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Mes de vencimiento(numero) :");
		int mesV = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Año de vencimiento:");
		int añoV = scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		
		Modelo modelo = new Modelo();
		modelo.setDetalle(detalle);
		modelo.setColor(color);
		modelo.setPeso(peso);
		modelo.setPrecio(precio);
		modelo.setUnidadesVendidas(unidades);
		LocalDate localDate = LocalDate.of(diaE, mesE, añoE);
		modelo.setFechaElaboracion(localDate);
		localDate = LocalDate.of(diaV, mesV, añoV);
		modelo.setFechaVencimiento(localDate);
		
		return modelo;
	}
	
	public void showFinancieroInfo(double gananciaBruta, double gananciaNeta, double perdidaProyectada, long difDias) {
		System.out.println("La info financiera es la siguiente:");
		System.out.println("Ganancia Bruta: "+ gananciaBruta);
		System.out.println("Ganancia Neta: "+ gananciaNeta);
		System.out.println("Perdida Proyectada: "+ perdidaProyectada);
		System.out.println("Diferencia dias: "+ difDias+"\n");
	}

	public int chooseAction() {
		System.out.println("Pulsa 1 si quieres añadir un nuevo pedido");
		System.out.println("Pulsa 2 si quieres ver la info financiera");
		System.out.println("Pulsa 3 si quieres salir");
		
		Scanner scanner =  new Scanner(System.in);
		int decision = scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		return decision;
	}
}

