package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);

		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
		
	   boolean valide = false;
       do {
    	   
    	   System.out.println("Entre com a popula��o A: ");
    	   popA = in.nextDouble();
    	   
    	   if (popA > 0) {
    		   valide = true;
    	   } else {
    		   System.out.println("Popula��o A precisa ser maior que 0.");
    	   }
    	 	 
		} while(!valide);
		
       valide = false;
       do {
    	   
    	   System.out.println("Entre com a popula��o B: ");
    	   popB = in.nextDouble();
    	   
    	   if (popB > 0) {
    		   valide = true;
    	   } else {
    		   System.out.println("Popula��o B precisa ser maior que 0.");
    	   }
    	 	 
		} while(!valide);
		
       valide = false;
       do {
    	   
    	   System.out.println("Entre com a taxa de crescimento da popula��o A: ");
    	   taxaA = in.nextDouble();
    	   
    	   if (taxaA > 0) {
    		   valide = true;
    	   } else {
    		   System.out.println("Taxa de crescimento A precisa ser maior que 0.");
    	   }
    	 	 
		} while(!valide);
       
       valide = false;
       do {
    	   
    	   System.out.println("Entre com a taxa de crescimento da popula��o B: ");
    	   taxaB = in.nextDouble();
    	   
    	   if (taxaB > 0) {
    		   valide = true;
    	   } else {
    		   System.out.println("Taxa de crescimento B precisa ser maior que 0.");
    	   }
    	 	 
		} while(!valide);
       
       int cont = 0;
       
       while(popA < popB) {
       
       popA += (popA/100)* taxaA;
	   popB += (popB/100)* taxaB;
	   cont++;		
	   
	}
	
	System.out.println("Popula��o A " +popA);
	System.out.println("Popula��o B " +popB); 
	System.out.println("N�meros de anos necess�rio: " +cont);
	
}
	
}



		
       
	
		

	




