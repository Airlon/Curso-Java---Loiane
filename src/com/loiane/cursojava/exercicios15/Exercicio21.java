package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		
		System.out.println("Qual a quantidade de litros vendidos? ");
		double quantidade = in.nextDouble();		
		
		System.out.println("Informe A para Alcool e G para Gasolina: ");
		String combustivel = in.next();
		
		
	    if(combustivel.equalsIgnoreCase("A") && quantidade <=20){
	    	double alcool = 1.90 * quantidade;
			double porce = alcool * 3;
			double resul1 = porce / 100;
			double resul2 = alcool - resul1;
			System.out.println("Valor a ser pago: R$" +resul2);
			
		}else if (combustivel.equalsIgnoreCase("A") && quantidade >=20) {
			double alcool = 1.90 * quantidade;
			double porce = alcool * 5;
			double resul1 = porce / 100;
			double resul2 = alcool - resul1;
			System.out.println("Valor a ser pago: R$" +resul2);
			
		}else if (combustivel.equalsIgnoreCase("G") && quantidade <=20){
			double gasolina = 2.50 * quantidade;
			double porce = gasolina * 4;
			double resul1 = porce / 100;
			double resul2 = gasolina - resul1;
			System.out.println("Valor a ser pago: R$" +resul2);
			
		}else if (combustivel.equalsIgnoreCase("G") && quantidade >=20){
			double gasolina = 2.50 * quantidade;
			double porce = gasolina * 6;
			double resul1 = porce / 100;
			double resul2 = gasolina - resul1;
			System.out.println("Valor a ser pago: R$" +resul2);
			
		
	}

}

}