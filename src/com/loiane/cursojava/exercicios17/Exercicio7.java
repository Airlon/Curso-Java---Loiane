package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int num1,num2,num3,num4,num5;
		
	
		System.out.println("Informe o primeiro número");
		num1= in.nextInt();
		
		System.out.println("Informe o segundo número");
		num2 = in.nextInt();
		
		System.out.println("Informe o terceiro número");
		num3 = in.nextInt();
		
		System.out.println("Informe o quarto número");
		num4 = in.nextInt();
		
		System.out.println("Informe o quinta número");
		num5 = in.nextInt();
		
		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println("Maior número " +num1);
			
		}
		
		else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("Maior número " +num2);
		}
		
		else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println("Maior número "+num3);
		}
		
		else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.println("Maior número " +num4);
		
	}
	
		else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
			System.out.println("Maior número " +num5);
}

	}
	
}

		
		

