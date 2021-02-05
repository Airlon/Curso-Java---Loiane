package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
       	
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = in.next();
		
		if(letra.length() > 1) {
			System.out.println("Não é uma letra válida");
		} else {
		
		switch(letra) {
		case "a": 
		case "e": 
		case "i": 
		case "o": 
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":	
		case "u": System.out.println("Letra digitada é Vogal"); break;
		default: System.out.println("Letra digitada é Consoante"); 
		}
		
     }
}
}


	