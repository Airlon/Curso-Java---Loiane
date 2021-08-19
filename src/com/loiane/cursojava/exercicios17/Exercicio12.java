package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int resultado;

		System.out.println("Informar qual a tabuada entre 1 a 10: ");
		int tabuada = in.nextInt();

		System.out.println("Tabuada de " +tabuada);
		
	        	for (int cont=1; cont<=10; cont++) {
	                resultado = tabuada * cont;
	        		
	        		
	        	System.out.println(tabuada + " x " +cont + " = " + resultado);
	        	}
	        }
	        	
	}
	



		


