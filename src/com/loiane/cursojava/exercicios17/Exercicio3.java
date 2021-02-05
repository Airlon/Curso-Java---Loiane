package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		boolean valide = true;

         	
		
	   	  
         while (valide) {
        	 
        	 System.out.println("Digite o nome: ");
        	 String nome = in.next();
           
          	if(nome.length()>3) {
          	break;
          	}else {
          		System.out.println("Nome precisa ser maior que 3 caracteres.Tente novamente.");
          	}
          	
          	}while (valide) {
          	
          		System.out.println("Digite a idade: ");
                int idade = in.nextInt();
             	
            if (idade > 0 && idade < 150) {
            	break;
            }else {
            	System.out.println("Idade invalida.Tente novamente.");
            }
          		
            
          	}while (valide) {
          	
          		System.out.println("Digite seu salario: ");
             	double salario = in.nextDouble();
             	break;          	
            }
          	
          	while(valide) {
          	    
          		System.out.println("Digite o sexo (f ou m) : ");
                String sexo = in.next();
                
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
            	break;
            }else {
            	System.out.println("Sexo invalide. Tente novamente");
            }
            
         }while (valide) {
        	
        	 System.out.println("Digite o estado civil (s,c,v ou d) :");
        	 String estCivil = in.next();
        
        	if (estCivil.equalsIgnoreCase("s") || estCivil.equalsIgnoreCase("c") || 
        	    estCivil.equalsIgnoreCase("v") || estCivil.equalsIgnoreCase("d")) {
       
        		break;
        		
        	}else {
        		System.out.println("Estado Civil invalido.Tente novamente.");
        	}
         }
         	
		
	}

}




