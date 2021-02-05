package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class ifElse {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		/*System.out.println("Informe sua idade: ");
		int idade = in.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade.");
		}else {
			System.out.println("Não é maior de idade");
		}*/
		
		System.out.println("Entre com o repço do item: ");
		double valor = in.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Está barato, pode comprar");
		}else if (valor > 10 && valor< 15) {
			System.out.println("Você pode pedir um desconto");
		}else if (valor >= 15 && valor < 17) {
	}else {
		System.out.println("Muito caro");
	}

}
	
}

