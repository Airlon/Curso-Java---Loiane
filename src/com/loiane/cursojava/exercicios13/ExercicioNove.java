package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double Farenheit;
		double Celsius;
		
		System.out.println("Qual a temperatura em graus F°: ");
		Farenheit = in.nextDouble();
		
		double resultado = (5 * (Farenheit -32) / 9);
		
		System.out.println("Temperatura em graus Celsius é: " +resultado+ "C°");
		

	}

}
