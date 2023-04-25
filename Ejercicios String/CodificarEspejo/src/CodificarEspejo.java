import java.util.Scanner;

public class CodificarEspejo {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String entrada;
	System.out.println("Introduce texto para codificar (introduce 'stop' para salir): ");
	while(true) {
		entrada = scanner.nextLine();
		if(entrada.equals("stop")) {
			break;
		}
		Espejo espejo = new Espejo(entrada);
		String codificado = espejo.codificar();
		System.out.println("Texto codificado: "+codificado);
	}
		
	}

}
