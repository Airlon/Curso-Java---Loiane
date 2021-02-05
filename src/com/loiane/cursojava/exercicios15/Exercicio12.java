package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
				
		System.out.println("Quanto você ganha por hora? ");
		double HomemHora = in.nextDouble();
		
		System.out.println("Quantas horas você trabalhou este mês? ");
		double HorasJob = in.nextDouble();
		
		double salario = HomemHora * HorasJob;
		double calc1 = 0;
		
		
		System.out.println("Salário Bruto: " +"R$ " +salario);
		
		//Calculo do IR
		if(salario <= 900) {
		 System.out.println("(-) IR: ISENTO");
	}else if (salario > 900 && salario < 1500) {
		 double porc1 = 5.00/100;
		 calc1 = porc1 * salario;
		 System.out.println("(-) IR (5%) : " +"R$ " +calc1);
		 
	}else if (salario > 1500 && salario < 2500) {
		 double porc1 = 10.00/100;
		  calc1 = porc1 * salario;
		 System.out.println("(-) IR (10%) : " +"R$ " +calc1);
	}else if (salario > 2500) {
		 double porc1 = 20.00/100;
		  calc1 = porc1 * salario;
		 System.out.println("(-) IR (20%) : " +"R$ " +calc1);
		 
	}
		 
		//Calculo do INSS
		double inss = 10.00/100;
		double result1 = inss * salario;
		System.out.println("(-) INSS (10%): " +"R$ " +result1);
		
		//Calculo do FGTS
		double fgts = 11.00/100;
		double result2 = fgts * salario;
		System.out.println("FGTS (11%) :" +"R$ " +result2);
		
		//Calculo total de desconto
		double desconto = calc1 + result1;
		System.out.println("Total de descontos: " +"R$ " +desconto);
		
		//Calculo Salario Liquido
		double liquido = salario - desconto;
		System.out.println("Salário Liquido: " +"R$ " +liquido);
		
    }
	
}



	




