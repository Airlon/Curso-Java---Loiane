package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe o dia da semana: ");
		int diaSemana = in.nextInt();
		
		switch (diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda");  break;
		case 3: System.out.println("Ter�a");  break;
		case 4: System.out.println("Quarta");  break;
		case 5: System.out.println("Quinta");  break;
		case 6: System.out.println("Sexta");  break;
		case 7: System.out.println("Sabado");  break;
		default: System.out.println("Valor inv�lido");  break;
		}
		

	}

}
