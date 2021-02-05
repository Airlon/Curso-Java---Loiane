package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.print("frutas            Até 5 kg       Acima de 5kg\n"
        		+     "\n Morango        R$ 2,50 por Kg      R$ 2,2O por Kg" 
        		+     "\n Maçã           R$ 1,80 por Kg      R$ 1,50 por Kg"
        		+     "\n-----------------------------------------------------");
        
        System.out.println("\nEntre com a quantidade em (Kg) de morango: ");
        double morango = in.nextDouble();
        
        System.out.println("Entre com a quantidade em (Kg) de maçã: ");
        double maca = in.nextDouble();
       

        double precoKgMorango = 0;
        double desconto = 0;
        double resultado = 0;
       
        if(morango <= 5) {
        	precoKgMorango = 2.50;
        }else {
        	precoKgMorango = 2.20;
        }
        
        double precoKgMaca = 0;
        
	    if(maca <= 5) {
	    	precoKgMaca = 1.80;
	    }else {
	    	precoKgMaca = 1.50;
	    }
 
	     double precototalMorango = morango * precoKgMorango;
	     double precototalMaca =  maca * precoKgMaca;
	     double precoParcial = precototalMorango+precototalMaca;
	     double precoTotal = precoParcial;
	     
        if (morango + maca > 8 || precoParcial > 25) {
          precoTotal = precoParcial - ((precoParcial/100) * 10);

      }
        System.out.println("Valor a ser pago é: " +precoTotal);
}
}


