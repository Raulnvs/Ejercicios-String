
public class MezclaStrings {
	  private String info1;
	    private String info2;

	    public MezclaStrings(String info1, String info2) {
	        this.info1 = info1;
	        this.info2 = info2;
	    }

	    public String getInfo1() {
	        return info1;
	    }

	    public String getInfo2() {
	        return info2;
	    }

	    // Método para mezclar los dos strings y añadir el tamaño mínimo y un punto al final
	    public String mezcla() {
	        StringBuilder resultado = new StringBuilder();
	        int minLength = Math.min(info1.length(), info2.length());

	        // Mezcla los caracteres de los dos strings
	        for (int i = 0; i < minLength; i++) {
	            resultado.append(info1.charAt(i));
	            resultado.append(info2.charAt(i));
	        }

	        // Añade los caracteres restantes del string más largo
	        if (info1.length() > minLength) {
	            resultado.append(info1.substring(minLength));
	        } else {
	            resultado.append(info2.substring(minLength));
	        }

	        // Añade el punto y el tamaño mínimo al final
	        resultado.append('.').append(minLength);

	        return resultado.toString();
	    }

	    // Método para separar los dos strings mezclados a partir de un string de entrada
	    public void separar(String introducir) {
	        int pun = introducir.lastIndexOf('.');
	        int min = Integer.parseInt(introducir.substring(pun + 1));
	        StringBuilder s1 = new StringBuilder();
	        StringBuilder s2 = new StringBuilder();

	        // Separa los caracteres mezclados en los dos strings originales
	        for (int i = 0; i < min * 2; i += 2) {
	            s1.append(introducir.charAt(i));
	            s2.append(introducir.charAt(i + 1));
	        }

	        // Añade los caracteres restantes al string más largo
	        s1.append(introducir.substring(min * 2, pun));

	        // Actualiza los atributos sInformacion1 y sInformacion2
	        this.info1 = s1.toString();
	        this.info2 = s2.toString();
	    }
}
