package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio19Ex2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		String opera; 
		boolean validacao = true;
		
		System.out.println("Informe o primeiro numero: ");
		num1 = in.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		num2 = in.nextInt();
		
		System.out.println("Qual operação deseja realizar (+ - / *)");
		opera = in.next();
		
		double resultado = 0;
		
		switch (opera) {
		case "+": resultado = num1+num2; break;
		case "-": resultado = num1-num2; break;
		case "/": resultado = num1/num2; break;
		case "*": resultado = num1*num2; break;
		default: System.out.println("Operação inválida");
		      validacao = false;
		}
		
	    if (validacao) {
		    System.out.println("Resultado é: " +resultado);
	
       if (resultado >=0) {
	        System.out.println("Resultado positivo");
       }else {
	        System.out.println("Resultado negativo");
       }
	    if (resultado % 2 ==0 ) {
    	   System.out.println("Resultado par");
       }else {
    	   System.out.println("Resultado ímpar");
       }
}
}
}




