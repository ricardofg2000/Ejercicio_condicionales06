package unico;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/* Realiza un programa que calcule la 
		   media de tres notas que se solicitarán al usuario.
		 */

		Scanner leer = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;
		double media;
		
		System.out.println("Introduzca la primera nota:");
		num1 = leer.nextDouble();
		System.out.println("Ahora la segunda nota:");
		num2 = leer.nextDouble();
		System.out.println("Por último la tercera nota:");
		num3 = leer.nextDouble();
		
		media = (num1 + num2 + num3)/3 ;
		
		System.out.println("Su nota media es " + media);
	}

}
