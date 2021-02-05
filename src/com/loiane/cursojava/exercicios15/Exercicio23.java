package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

       Scanner in = new Scanner (System.in);
       
       
       
       System.out.print("Carnes            Até 5 kg           Acima de 5kg\n"
       		+     "\n File Duplo        R$ 4,90 por Kg      R$ 5,80 por Kg" 
       		+     "\n Alcatra           R$ 5,90 por Kg      R$ 6,80 por Kg"
       		+     "\n Picanha           R$ 6,90 por Kg      R$ 7,80 por Kg"
      		+     "\n-----------------------------------------------------");
       
       System.out.println("\nInforme qual o tipo de carne (FileDuplo/Alcatra/Picanha): ");
       String carne = in.next();
       
       System.out.println("Informe a quantidade em (Kg): ");
       double quantidade = in.nextDouble();

       double totalsoma = 0;
    
       
       if (carne.equalsIgnoreCase("FileDuplo")) {
      
    	   if(quantidade <= 5) {
    	    totalsoma = 4.90;
    	   } else {
    	    totalsoma = 5.80;
    	
       }
        
       } else if (carne.equalsIgnoreCase("Alcatra")) {
    	   
    	   if(quantidade <= 5) {
    	    totalsoma = 5.90;

       }else {
    	    totalsoma = 6.80;
   
       }
       
       } else if(carne.equalsIgnoreCase("Picanha")) {
    	   
    	   if(quantidade <= 5) {
    	    totalsoma = 6.90;
    
       }else {
    	    totalsoma = 7.80;
  
       }
       }
	  double desconto = 0;
      double valorfinal = 0;
  
      
       double total = quantidade * totalsoma;
       
       System.out.println("Informe a forma de pagamento (Dinheiro/CartãoTabajara);");
       String pagamento = in.next();
      
       if(pagamento.equalsIgnoreCase("CartãoTabajara")) {
    	 desconto = (total/100) * 5;
    	 valorfinal = total - desconto;
       }
    	 
       System.out.println("Tipo de Carne: " +carne);
       System.out.println("Quantidade de Carne (Kg): " +quantidade);
       System.out.println("Valor Total da compra: R$ " +total);
       System.out.println("Tipo de pagamento: " +pagamento);
       System.out.println("Valor do desconto: R$ " +desconto);
       
       if (pagamento.equalsIgnoreCase("Dinheiro")) {
       System.out.println("Valor total a pagar: R$ " +total);
       }else {
	   System.out.println("Valor total a pagar: R$ " +valorfinal);
	}

	}
}


       
	

