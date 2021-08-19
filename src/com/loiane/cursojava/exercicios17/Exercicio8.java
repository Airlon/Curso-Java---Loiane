package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
	
	Scanner in = new Scanner (System.in);
		
		int num1,num2,num3,num4,num5;
		double soma;
		
	
		System.out.println("Informe o primeiro número");
		num1= in.nextInt();
		
		System.out.println("Informe o segundo número");
		num2 = in.nextInt();
		
		System.out.println("Informe o terceiro número");
		num3 = in.nextInt();
		
		System.out.println("Informe o quarto número");
		num4 = in.nextInt();
		
		System.out.println("Informe o quinta número");
		num5 = in.nextInt();
		
		
		soma = num1+num2+num3+num4+num5;
		
		double media = soma/6;
		
		System.out.println("A soma dos números é " +soma);
		System.out.println("A média dos números é " +media);
		

	}

}
