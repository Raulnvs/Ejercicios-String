
public class Espejo {
	 private String texto;
	public Espejo(String texto) {
		this.texto=texto;
	}
	
	public String getTexto() {
		return texto;
	}
	public String codificar() {
		String[]palabras = texto.split("\\s+");//separar texto por espacios
		StringBuilder resultado = new StringBuilder();//para crear o manipular cadenas de caracteres
		for(String palabra: palabras) {
		resultado.append(new StringBuilder(palabra).reverse().toString()+" ");	
		/*
		 * el append es para agragar caracteres o strings al final del stringbuilder
		 * reverse para invertir el orden de los caracteres del stringbuilder
		 */
		
		}
		//trim para eliminar espacio al final
		return resultado.toString().trim();
	}
	
}
