package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class ExercicioDoze {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double altura;

		
		System.out.println("Qual sua altura: ");
		altura = in.nextDouble();
		
		double peso = (72.7 * altura) - 58;
		
		System.out.println(" Seu peso ideal é: " +peso);

	}

}
