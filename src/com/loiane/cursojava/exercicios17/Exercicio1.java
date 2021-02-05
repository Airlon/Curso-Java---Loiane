package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
       
		Scanner in = new Scanner (System.in);

		boolean notaValida = false;
		
		do {
		
		System.out.println("Informe a nota: ");
		double nota = in.nextDouble();
		
		if (nota >= 0 && nota <= 10 ) {
			notaValida = true;
			System.out.println("Você digitou: " +nota);
		}else {
			System.out.println("Nota inválida, digite notamente.");
			
		}

	} while (!notaValida);

	}
	
}

