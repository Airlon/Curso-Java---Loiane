package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

    Scanner in = new Scanner (System.in);
    
  
	String perg1, perg2, perg3, perg4, perg5;
    
    System.out.println("Telefonou para a vítima? ");
    perg1 = in.next();
    
    System.out.println("Este no local do crime? ");
    perg2 = in.next();

    System.out.println("Mora perto da vítima? ");
    perg3 = in.next();

    System.out.println("Devia para a vítima? ");
    perg4 = in.next();
    
    System.out.println("Já trabalhou com a vítima? ");
    perg5 = in.next();
    
    int cont = 0;
    
    if (perg1.equalsIgnoreCase("Sim")) {
    	cont++;	
    }   
    if (perg2.equalsIgnoreCase("Sim")) {
    	cont++;
    }
    if (perg3.equalsIgnoreCase("Sim")) {
    	cont++;
    }
    if (perg4.equalsIgnoreCase("Sim")) {
    	cont++;
    }
    if (perg5.equalsIgnoreCase("Sim")) {
    	cont++;
    }
    if (cont == 2) {
    	System.out.println("Você é Suspeita");
    }else if (cont == 3 || cont == 4) {
    	System.out.println("Você é Cúmplice");
    }else if (cont == 5) {
    	System.out.println("Você é Assasino");
    }else {
    	System.out.println("Você é Inocente");
    }
  }
  
}

