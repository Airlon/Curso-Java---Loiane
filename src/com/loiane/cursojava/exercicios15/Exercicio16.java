package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Entre com o valor de a: ");
		int a = in.nextInt();
		
		if (a==0) {
			System.out.println("Não é equação de segundo grau");
		}else {
		

		System.out.println("Entre com o valor de b: ");
		int b = in.nextInt();
		
		System.out.println("Entre com o valor de c: ");
		int c = in.nextInt();
		
		double delta = (b*b) -(4*a*c);	
		if(delta < 0) {
			System.out.println("Delta negativo");
		}else {
			double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
			double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
			
			System.out.println("delta " +delta);
			
			System.out.println("x1 = " +x1);
			System.out.println("x2 = " +x2);
		}

            }
         }
}
