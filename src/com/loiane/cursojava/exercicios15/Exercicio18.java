package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe um n�mero para saber se � impar ou par: ");
		int num = in.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("N�mero � par");
		}else {
			System.out.println("N�mero � impar");
		}
				

	}

}
