package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Média de Aproveitamento     Conceito\n" 
				          + "                                 \n"
				          + "Entre 9.0 e 10.0         A       \n"
				          + "Entre 7.5 e 9.0          B       \n"
				          + "Entre 6.0 e 7.5          C       \n"
				          + "Entre 4.0 e 6.0          D       \n"
				          + "Entre 4.0 e zero         E       \n"
				          + "                                 \n"
				                               );
		
		System.out.println("Digite sua primeira nota: ");
		double nota1 = in.nextDouble();
		
		System.out.println("Digite sua primeira nota: ");
		double nota2 = in.nextDouble();
		
		double soma = nota1 + nota2;
		double media = soma/2;
		
		System.out.println("Sua média é: " +media);
		
		
		if (media >= 9 && media <10) {
			System.out.println("Conceito: A");
			System.out.println("Aprovado");
		}else if (media >= 7.5 && media < 9) {
			System.out.println("Conceito: B");
			System.out.println("Aprovado");
		} else if (media >= 6 && media <7.5) {
			System.out.println("Conceito: C");
			System.out.println("Aprovado");		
		} else if (media >= 4 && media <6) {
			System.out.println("Conceito: D");
			System.out.println("Reprovado");	
		} else if (media >= 4 && media <0) {
			System.out.println("Conceito: E");
			System.out.println("Reprovado");
		}
	}

	}
