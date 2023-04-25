import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
	        String primerT, segundoT;

	        System.out.println("Introduce el primer texto: ");
	        primerT = scanner.nextLine();

	        System.out.println("Introduce el segundo texto: ");
	        segundoT = scanner.nextLine();

	        MezclaStrings mezclaStrings = new MezclaStrings(primerT, segundoT);
	        String mezclado = mezclaStrings.mezcla();
	        System.out.println("Texto mezclado: " + mezclado);

	        mezclaStrings.separar(mezclado);
	        System.out.println("Textos separados: " + mezclaStrings.getInfo1() + " y " + mezclaStrings.getInfo2());



	}

}
