package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite a Letra M ou F: ");
		String sexo = in.next();
		
		if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		}else if (sexo.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		}else {
			System.out.println("Sexo inválido");
		}
		
	}
}
