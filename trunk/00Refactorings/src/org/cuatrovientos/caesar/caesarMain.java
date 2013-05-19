package org.cuatrovientos.caesar;

/**
 * Main class for testing my cipher method
 * @author Julius Caesar
 *
 */
public class caesarMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		caesar_cypher cc = new caesar_cypher(3);
		System.out.println(cc.encrpt("avecaesar"));
		System.out.println(cc.decrpt("dyhfdhvdu"));
		
	}

}
