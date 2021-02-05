package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.print( "Digite M para matutino, V para Vespertino e N para Noturno" + "\n");
		System.out.println("\n" + "Qual turno você estuda: ");
		String turno = in.next();
		
		if (turno.equalsIgnoreCase("M")) {
			System.out.println("Bom Dia!");	
			
	}else if (turno.equalsIgnoreCase("V")) {
		System.out.println("Boa Tarde!");	
	}else if (turno.equalsIgnoreCase("N")) {
		System.out.println("Boa Noite!");
	}else {
		System.out.println("Valor Inválido");
	}

}
	
}
