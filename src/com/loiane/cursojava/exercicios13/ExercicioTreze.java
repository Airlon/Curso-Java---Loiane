package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class ExercicioTreze {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double HomemHora;
		double HorasJob;
		double IRF, INSS, SINDICATO;
		
		
		System.out.println("Quanto você ganha por hora? ");
		HomemHora = in.nextDouble();
		
		System.out.println("Quantas horas você trabalhou este mês? ");
		HorasJob = in.nextDouble();
		
		double salariobruto = HomemHora * HorasJob;
		
		IRF = 11* salariobruto/100;
		INSS =  8 * salariobruto/100;
		SINDICATO = 5 * salariobruto/100;
		
		double salarioliquido = salariobruto - IRF - INSS - SINDICATO;
		
		System.out.println("Seu salario bruto é: " +salariobruto);
		System.out.println("Você pagou de Imposto de renda: " +IRF);
		System.out.println("Você pagou de INSS: " +INSS);
		System.out.println("Você pagou de Sindicato: " +SINDICATO);
		System.out.println("Seu Salario Liquido: " +salarioliquido);

	}

}
