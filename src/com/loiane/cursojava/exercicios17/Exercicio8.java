package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
	
	Scanner in = new Scanner (System.in);
		
		int num1,num2,num3,num4,num5;
		double soma;
		
	
		System.out.println("Informe o primeiro n�mero");
		num1= in.nextInt();
		
		System.out.println("Informe o segundo n�mero");
		num2 = in.nextInt();
		
		System.out.println("Informe o terceiro n�mero");
		num3 = in.nextInt();
		
		System.out.println("Informe o quarto n�mero");
		num4 = in.nextInt();
		
		System.out.println("Informe o quinta n�mero");
		num5 = in.nextInt();
		
		
		soma = num1+num2+num3+num4+num5;
		
		double media = soma/6;
		
		System.out.println("A soma dos n�meros � " +soma);
		System.out.println("A m�dia dos n�meros � " +media);
		

	}

}
