package com.loiane.cursojava.exercicios13;

import java.util.Scanner;

public class ExercicioQuatorze {

	public static void main(String[] args) {
       
		Scanner in = new Scanner (System.in);
		
		double arquivo;
		double internet;
		
		System.out.println("Informe o tamanho do arquivo para download em MB: ");
		arquivo = in.nextDouble();
		
		System.out.println("Informe a velocidade da internet Mbps: ");
		internet = in.nextDouble();
		
		double resultado = arquivo / internet;
        
		System.out.println("O tempo para download é de: " +resultado + " minutos");
	}

}
