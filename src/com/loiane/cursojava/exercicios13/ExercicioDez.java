package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

		double celsius;
		
		System.out.println("Informe a temperatura em Celsius: ");
		celsius = in.nextDouble();
		
		double resultado = celsius * 1.8 + 32;
		
		System.out.println("Temperatura em graus Farenheit é: " +resultado+ "F°");
		

	}

}
