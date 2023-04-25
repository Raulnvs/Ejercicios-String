
public class crc {
private String informacion;
public crc(String info) {
	this.informacion=info;
}
//metodo para calcular el crc de entrada
	public String getCrc() {
		StringBuilder codigo = new StringBuilder();//para manipular o crear cadenas de caracteres
		for(int i=0;i<informacion.length()-1;i+=2) {
			//obtiene el 1 y 2 del caracter par
			int num1 = informacion.charAt(i);
			int num2 = informacion.charAt(i+1);
			//calcular media de caracteres
			int media = (num1+num2)/2;
			codigo.append((char)media);
		}
		return codigo.toString();
	}
	//metodo para saber si el crc coincide con el calculado
	public int testCRC(String cRc) {
		//verifica si el tamaño del crc coincide
		if(cRc.length()!=getCrc().length()) {
			return -1;
		}
		int errores = 0;
		for(int i=0;i<cRc.length();i++) {
			//si los caracteres no coinciden,aumenta errores
			if(cRc.charAt(i)!=getCrc().charAt(i)) {
				errores++;
			}
		}
		return errores;
	}
	
}
