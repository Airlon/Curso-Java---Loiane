package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {


		Scanner in = new Scanner (System.in);
		
		boolean valide = false;
		
		do {
		
		System.out.println("nome do usu�rio:");
		String user = in.next();
		
		System.out.println("senha de acesso");
		String password = in.next();
		
		if (user.equalsIgnoreCase(password)) {
			System.out.println("nome do usu�rio n�o pode ser igual a senha.Tente novamente.");
		}else  {
			valide = true;
			System.out.println("Usu�rio e senha corretos.");
		}
		
	}while (!valide); 
		
	}

}


