package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		double nota1, nota2, nota3, nota4;
		int media = 4;

		
		System.out.println("Digite sua primeira nota: ");
		nota1 = in.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		nota2 = in.nextDouble();
		System.out.println("Digite sua terceira nota: ");
		nota3 = in.nextDouble();
		System.out.println("Digite sua quarta nota: ");
		nota4 = in.nextDouble();
		
		double soma = nota1 + nota2 + nota3 + nota4;
		
		double resultado = soma / media;
		
		System.out.println("Sua media é: " + resultado);
		
		{
			if(resultado >= 4) {
			System.out.println("Aprovado!");
			
		} else {
		    System.out.println ("Reprovado!");
	}
		

}
	}
	
}

	
		
		

