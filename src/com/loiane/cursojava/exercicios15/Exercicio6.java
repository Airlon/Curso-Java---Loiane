package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		double num1 = in.nextDouble();
		
		System.out.println("Informe o segundo n�mero: ");
		double num2 = in.nextDouble();
		
		System.out.println("Informe o terceiro n�mero: ");
		double num3 = in.nextDouble();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Maior n�mero �: " +num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Maior n�mero �: " +num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("Maior n�mero �: " +num3);
		}
	}

}


