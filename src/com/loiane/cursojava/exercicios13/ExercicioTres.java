package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
     
		int numero1;
		int numero2;
		
		System.out.println("Informe o primeiro numero: ");
		numero1 = in.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		numero2 = in.nextInt();
		
		 int resultado = numero1 + numero2;
		 
		 System.out.println(" O resultado é: " + resultado);


	}

}
