import java.util.Vector;

/**
 * 
 */

/**
 * @author DAM1
 *
 */
public class Cesta {
Vector<Comida> comidas=new Vector <Comida>();
public void meterComida(Comida comida){
	comidas.add(comida);
}

/**
 * 
 * @return
 */
public float pesoTotal(){
	float resultado=0;
	for(int i=0; i<comidas.size();i++){
		resultado=resultado+comidas.get(i).getPeso();
		
	}
	return resultado;
	
}

/**
 * 
 * @return
 */
public String toString(){
	String resultado="";
	for(int i=0; i<comidas.size();i++){
		resultado=resultado+comidas.get(i).toString() +"\n";
		
	}
	return resultado;
	
}





	




}
