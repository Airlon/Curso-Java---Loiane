package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1 =0;
		int num2 =0;
		String operacao;
		double soma = 0;
		double subtracao = 0;
		double divisao = 0;
		double multiplicacao = 0;
		boolean validacao = true;
		
		System.out.println("Informe o primeiro n�mero: ");
		num1 = in.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		num2 = in.nextInt();
		
		System.out.println("Informe a opera��o (+ - / *)");
		operacao = in.next();

		
		if (operacao.equalsIgnoreCase("+")) {
			 soma = num1+num2;
			 System.out.println("O resultado �: " +soma);
			 
		} else if (operacao.equalsIgnoreCase("-")) {
			 subtracao = num1-num2;
			 System.out.println("O resultado �: " +subtracao);
			 
		}else if (operacao.equalsIgnoreCase("/")) {
			 divisao = num1/num2;	 
			 System.out.println("O resultado �: " +divisao);
			 
		}else if (operacao.equalsIgnoreCase("*")) {
			 multiplicacao = num1*num2;
			 System.out.println("O resultado �: " +multiplicacao);
		}else {
			System.out.println("Operacao inv�lida"); validacao = false;
		}
		
		if(validacao) {
			
		if (soma % 2 == 0 && subtracao % 2 ==0 && divisao % 2 == 0 && multiplicacao % 2 ==0) {
			System.out.println("N�mero � par");
		}else {
			System.out.println("N�mero � impar");
		}
		
		if (soma >= 0 && subtracao >= 0 && divisao >= 0 && multiplicacao >= 0) {
			System.out.println("Positivo");
		
		} else {
			System.out.println("Negativo");
}
	}
	}
}

	
