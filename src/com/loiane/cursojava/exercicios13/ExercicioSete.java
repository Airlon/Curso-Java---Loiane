package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        System.out.println("Informe o número do quadrado: ");
        int lado = in.nextInt();
        
		double resultado = Math.pow(lado, 2);
		
		System.out.println(" A área de um quadrado é: " + resultado + " m2");
		
		double resultado2 = resultado * 2;
		
		System.out.println("O dobro da área é: " +resultado2+ " m2");
		

	}

}
