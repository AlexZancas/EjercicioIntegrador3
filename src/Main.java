
public class Main {
	public static void main(String[] args) {
		Vista vista = new Vista();
		vista.run();
		Controlador controlador = new Controlador(vista);
		controlador.run();
		int choosenAction = 1;
		
		while(choosenAction!=3) {
			choosenAction = vista.chooseAction();
			switch (choosenAction) {
			case 1: {
				controlador.addModelo();
			}
			case 2: {
				controlador.showInfo();
				
			}
			case 3: {
				System.exit(0);
				
			}
			default:
				System.out.println("No existe la opcion");
			}
		}
	}
}
