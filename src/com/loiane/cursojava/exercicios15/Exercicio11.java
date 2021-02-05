package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe seu salario: ");
		double salario = in.nextDouble();
		
		if (salario <= 280) {
			double porc1 = 20.00/100;
			double cal1 = salario * porc1;
			double result = cal1 + salario;
			System.out.println ("Seu Salario atual é: " +"R$" +salario);
			System.out.println("Foi aplicado: "+"20%"+" de aumento salarial");
			System.out.println("Valor de aumento é de: " +"R$" +cal1);
			System.out.println ("Seu salario rejustado é: " +"R$" +result);
		}else if (salario > 280 && salario <= 700) {
			double porc1 = 15.00/100;
			double cal1 = salario * porc1;
			double result = cal1 + salario;
			System.out.println ("Seu Salario atual é: " +"R$" +salario);
			System.out.println("Foi aplicado: "+"15%"+" de aumento salarial");
			System.out.println("Valor de aumento é de: " +"R$" +cal1);
			System.out.println ("Seu salario rejustado é: " +"R$" +result);
		}else if (salario > 700 && salario <=1500) {
			double porc1 = 10.00/100;
			double cal1 = salario * porc1;
			double result = cal1 + salario;
			System.out.println ("Seu Salario atual é: " +"R$" +salario);
			System.out.println("Foi aplicado: "+"10%"+" de aumento salarial");
			System.out.println("Valor de aumento é de: " +"R$" +cal1);
			System.out.println ("Seu salario rejustado é: " +"R$" +result);
		} else if (salario >1500) {
			double porc1 = 5.00/100;
			double cal1 = salario * porc1;
			double result = cal1 + salario;
			System.out.println ("Seu Salario atual é: " +"R$" +salario);
			System.out.println("Foi aplicado: "+"5%"+" de aumento salarial");
			System.out.println("Valor de aumento é de: " +"R$" +cal1);
			System.out.println ("Seu salario rejustado é: " +"R$" +result);

	}

  }
}

