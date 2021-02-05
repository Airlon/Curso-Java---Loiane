package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio8 {
	
		public static void main(String[] args) {
	       	
			Scanner in = new Scanner (System.in);

			System.out.println("Qual o preço do primeiro Produto");
			double prod1 = in.nextDouble();
			
			System.out.println("Qual o preço do segundo Produto");
			double prod2 = in.nextDouble();
			
			System.out.println("Qual o preço do terceiro Produto");
			double prod3 = in.nextDouble();
			
		if (prod1 < prod2 && prod1 < prod3) {
			System.out.println("O produto com menor valor é: " +prod1);
		}else if (prod2 < prod1 && prod2 < prod3) {
			System.out.println("O produto com menor valor é: " +prod2);
		} else if (prod3 < prod1 && prod3 < prod2) {
			System.out.println("O produto com menor valor é: " +prod3);
		}
	}

}
