
public class Cadena {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	/**
	 * longitud
	 * @param cadena
	 * @return longitud de la cadena
	 */
	public int longitud(String cadena){
		return cadena.length();
	}
	/**
	 * Agradecimientos a Tejedor y saludos a todos
	 * Devuelve el número de vocales que tiene la cadena
	 * @param cadena
	 * @return contador
	 */
	public int vocales(String cadena){
		String vocales="aeiou";
		int cont=0;
		for(int i=0;i<cadena.length();i++){
			if(vocales.contains(String.valueOf(cadena.charAt(i)))){
			// bajeril style, probar.
			//if(vocales.contains(cadena.charAt(i) + "")){
				cont++;
			}
		}
		return cont;
	}
	
	/**
	 * invierte una cadena. Gracias a Pello.
	 * @param cadena
	 * @return
	 */
	public String invertir (String cadena)
	{
		String resultado="";
		for(int i=cadena.length()-1;i>=0;i--)
		{
			resultado+=cadena.charAt(i);
					
		}
		return resultado;
	}
	
	/**
	 * cuenta el número de veces que aparece el
	 * caracter en la cadena
	 * @param cadena
	 * @param caracter
	 * @return
	 */
	public int contarLetra (String cadena, char caracter) {
		int contador = 0;
		for (int i=0;i<cadena.length();i++)
			if (cadena.charAt(i) == caracter)
				contador++;
		
		return contador;
	}
	
	
}
