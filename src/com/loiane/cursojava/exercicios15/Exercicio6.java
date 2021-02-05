package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		double num1 = in.nextDouble();
		
		System.out.println("Informe o segundo número: ");
		double num2 = in.nextDouble();
		
		System.out.println("Informe o terceiro número: ");
		double num3 = in.nextDouble();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Maior número é: " +num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Maior número é: " +num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("Maior número é: " +num3);
		}
	}

}


