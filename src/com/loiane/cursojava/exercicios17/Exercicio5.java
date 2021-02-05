package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		boolean valide = true;
		int ano = 0;

		
		while (valide) {
			System.out.println("Informe o número de população: ");
			double popu = in.nextDouble();
			
			System.out.println("Informe a taxa anual de crescimento: ");
			double taxa = in.nextDouble();
			
			double conta = popu+popu*taxa;
			ano =  ano +1;
			
		if (conta <=popu) 
			System.out.println("Anos: " +ano);
			
		}

		
		

	}
		
	}




