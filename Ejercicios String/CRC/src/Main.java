import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el texto a codificar: ");
		String texto = scanner.nextLine();
		crc crC = new crc(texto);
		String crcGenerado = crC.getCrc();
		System.out.println("El CRC generado es: "+crcGenerado);
		System.out.println("Introduce el CRC a comprobar: ");
		String crcIntroducido = scanner.nextLine();
		int errores = crC.testCRC(crcIntroducido);
		if(errores == -1) {
			System.out.println("El tamaño del CRC introducido no coincide con el generado.");
		}else if(errores == 0) {
			System.out.println("El CRC introducido es correcto.");
		}else {
			System.out.println("El CRC introducido tiene "+errores+" errores.");
		}
		

	}

}
