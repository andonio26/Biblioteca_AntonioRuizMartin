package Ejercicios;

import java.util.Scanner;
public class Ejercicio5 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el número");
		
		//valores de los números
		int numero1 = Integer.parseInt(sc.nextLine());
		int numero2 = Integer.parseInt(sc.nextLine());
		
		//Valores de las operaciones
		
		int suma = numero1 + numero2;
		int resta = numero1 - numero2;
		int multiplicacion = numero1 * numero2;
		int division = numero1 / numero2;
		int modulo = numero1 % numero2;
		
		//Lanzamiento de las operaciones por la consola
		
		System.out.println("El resultado de la operación es: " + suma);
		System.out.println("El resultado de la operación es: " + resta);
		System.out.println("El resultado de la operación es: " + multiplicacion);
		System.out.println("El resultado de la operación es: " + division);
		System.out.println("El resultado de la operación es: " + modulo);
		
		sc.close();
	}
	
}