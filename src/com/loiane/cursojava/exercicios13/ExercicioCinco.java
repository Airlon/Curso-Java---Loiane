package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		double metros;
		double centimetros = 100;
		
		System.out.println("Converter METROS em CENTIMETROS");
		System.out.println("Digite o metro: ");
		metros = in.nextDouble();
		
		double resultado = metros * centimetros;
		
		System.out.println("Resultado : " + resultado + " cm");
		in.close();

	}

}
