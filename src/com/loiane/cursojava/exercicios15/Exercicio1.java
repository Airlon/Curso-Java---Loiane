package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe o primeiro n�mero:");
		double numero1 = in.nextInt();
		
		System.out.println("Informe o primeiro n�mero:");
		double numero2 = in.nextInt();
		
    if (numero1 > numero2) {
    	System.out.println("Maior n�mero " +numero1);
    	
	}else {
        System.out.println("Maior n�mero " +numero2);
}
}
}