package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe um número para saber se é impar ou par: ");
		int num = in.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Número é par");
		}else {
			System.out.println("Número é impar");
		}
				

	}

}
