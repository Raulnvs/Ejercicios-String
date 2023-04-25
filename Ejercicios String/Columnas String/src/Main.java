import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String gyaguagua;
		int gyugugu;
		while(true) {
			System.out.println("Introduce el texto: ");
			gyaguagua = entrada.nextLine();
			if(gyaguagua.equalsIgnoreCase("stop")) {
				break;
			}
			System.out.println("Introduce el numero de repeticiones: ");
			gyugugu = entrada.nextInt();
			entrada.nextLine();
			ColumnasString columnas = new ColumnasString(gyaguagua, gyugugu);
			System.out.println("Texto codificado: "+columnas.imprime());
		}
	}

}
