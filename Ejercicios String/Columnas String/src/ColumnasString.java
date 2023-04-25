
public class ColumnasString {
private String introducir;
private int repetir;
public ColumnasString(String introducir, int repetir) {
	this.introducir = introducir;
	this.repetir = repetir;
}
public String getIntroducir() {
	return introducir;
}
public int getRepetir() {
	return repetir;
}
public String imprime() {
	StringBuilder resultado = new StringBuilder();
	for(char caracter:introducir.toCharArray()) {
		for(int i=0;i<repetir;i++) {
			resultado.append(caracter);
		}
	}
	return resultado.toString();
}
	
	
	
}
