package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio21Ex2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual o quantidade de litros vendidos? ");
		double litros = in.nextDouble();
		
		System.out.println("Qual o tipo de combustivel? (A-alcool/G-Gasolina) ");
		String combustivel = in.next();
		
		double porcDesconto = 0;
		double alcool = 1.90;
		double gasolina = 2.50;
		double totalDesc =0;
		double total = 0;
		
		if (combustivel.equalsIgnoreCase("A")) {
	       
			if(litros <=20) {
				porcDesconto = 3;
			}else {
				porcDesconto = 5;
			}
			
			 total = litros * alcool;
			
		} else if (combustivel.equalsIgnoreCase("G")) {
			
			if(litros >= 20) {
				porcDesconto = 4;
			}else {
				porcDesconto = 6;
			}
			
			 total = litros * alcool;
		}
		
           totalDesc = (total / 100) * porcDesconto;
           double totalPagar = total - totalDesc;
           
           System.out.println("Valor a pagar: R$ " +totalPagar);
	}

}
