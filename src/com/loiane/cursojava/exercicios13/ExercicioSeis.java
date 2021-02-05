package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        
		double raio;
		double pi = 3.14;
		
		System.out.println("Digite o raio do círculo: ");
		raio = in.nextDouble();
		
		double resultado = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é:" +resultado + "cm²");
		

	}

}
