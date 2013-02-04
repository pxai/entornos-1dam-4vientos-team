/**
 * 
 */

/**
 * @author pello_altadill
 *
 */
public class ClasePrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cesta miCesta=new Cesta();
		Comida miComida=new Comida("Plátano",100);
		Comida mi2Comida=new Comida("Melocotón",150);
		Caramelo miCaramelo=new Caramelo("C.Fresa",20);
		Fruta fruta1=new Fruta("Manzana",5);
		Caramelo carameloraro = new Caramelo("Carameloraro", 20);
		//A la cesta!!
		miCesta.meterComida(mi2Comida);
		miCesta.meterComida(miComida);
		miCesta.meterComida(miCaramelo);
		miCesta.meterComida(fruta1);
		miCesta.meterComida(carameloraro);
		//Mostramos la cesta
		System.out.println(miCesta.toString());
		//y el peso
		System.out.println(miCesta.pesoTotal());
	
	}
	

}
