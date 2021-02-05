package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		double nota1 = in.nextDouble();
		
		System.out.println("Digite sua primeira nota: ");
		double nota2 = in.nextDouble();
		
		double soma = nota1 + nota2;
		double media = soma/2;
		
		System.out.println("Sua média é: " +media);
		
		if (media >= 7 && media <9) {
			System.out.println("Aprovado");
		}else if (media < 7) {
			System.out.println("Reprovado");
		} else if (media == 10) {
			System.out.println("Aprovado com Distinção");
			
		}
	}

}
		

