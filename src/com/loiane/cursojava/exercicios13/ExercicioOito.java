package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
       
		Scanner in = new Scanner (System.in);
		
		double HomemHora;
		double HorasJob;
		
		System.out.println("Quanto voc� ganha por hora? ");
		HomemHora = in.nextDouble();
		
		System.out.println("Quantas horas voc� trabalhou este m�s? ");
		HorasJob = in.nextDouble();
		
		double resultado = HomemHora * HorasJob;
		
		
		System.out.println("Seu salario no m�s �: " +resultado);


	}

}
