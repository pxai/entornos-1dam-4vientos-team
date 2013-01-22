import java.util.Enumeration;

/**
 * 
 */

/**
 * @author Fermín Arricibita
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Alumno tePillaron = new Alumno("12345678Z", "Hola", "DAM");
Grupo miGrupo = new Grupo("DAM");
miGrupo.put("12345678Z", tePillaron);
miGrupo.put("21345678X", new Alumno("21345678X","Pepe", "DAM"));
// Saco las claves
Enumeration claves = miGrupo.keys();
	while (claves.hasMoreElements()) {
		System.out.println(
				miGrupo.get(
						claves.nextElement()).toString());
	}//while
	
	// LO MISMO DE OTRA FORMA
	claves = miGrupo.keys();
	String clave = "";
	Alumno alumno = null;
	while (claves.hasMoreElements()) {
		clave = claves.nextElement().toString();
		alumno = miGrupo.get(clave);
		System.out.println(alumno.toString());
	}//while

}//main
}// end class