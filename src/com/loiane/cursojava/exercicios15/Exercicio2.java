package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
	System.out.println("Digite um valor: ");
	double valor1 = in.nextInt();
	
	if (valor1 < 0) {
		System.out.println("Valor negativo");
	}else {
		System.out.println("Valor positivo");
	}

	}

}
