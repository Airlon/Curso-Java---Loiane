package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero1;
		int numero2;
		double numeroreal ;
		
		System.out.println("Digite o primeiro número: " );
		numero1 = in.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = in.nextInt();
		
		System.out.println ("Digite o numero real: ");
		numeroreal = in.nextDouble();
		
		int resultado = numero1 * 2 * (numero2/2);
		double resultado1 = numero1 * 3 + numeroreal;
		double resultado2 = Math.pow(numeroreal, 3);
		
		System.out.println ("O dobro do primeiro com a metade do segundo é: " +resultado);
		System.out.println("A soma do triplo do primeiro com o terceiro é: " +resultado1);
		System.out.println("O terceiro elevado ao cubo é: " + resultado2);
		
		

	}

}
