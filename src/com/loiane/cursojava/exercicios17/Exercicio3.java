package com.loiane.cursojava.exercicios17;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		boolean valide = false;    
		
		String nome;
		int idade;
		double salario;
		String sexo;
		String estCivil;
	
         do {
        	 
        	 System.out.println("Digite o nome: ");
        	 nome = in.next();
           
          	if(nome.length()>=3) {
                valide = true;
          	}else {
          		System.out.println("Nome precisa ser maior que 3 caracteres.Tente novamente.");
          	}
          	
         } while (!valide);
          	
         valide= false;
         
          do {
          		System.out.println("Digite a idade: ");
                idade = in.nextInt();
             	
            if (idade > 0 && idade <= 150) {
            	valide = true;
            }else {
            	System.out.println("Idade invalida.Tente novamente.");
            	
            }
            
          }while (!valide);
            
            valide= false;
            
            do {
                   System.out.println("Digite seu salario:");
                   salario = in.nextDouble();
                   
                if (salario >0) {
                	valide = true;
                              
                } else {
                	System.out.println("Salario tem que ser maior que 0.");
                	
                }
                
            }while(!valide);
                
                valide = false;
                
                do {
               	 
               	 System.out.println("Digite o sexo m ou f: ");
               	 sexo = in.next();
                  
                 	if(sexo.equalsIgnoreCase("M")|| 
                 			sexo.equalsIgnoreCase("F")) {
                       valide = true;
                 	}else {
                 		System.out.println("sexo invalido, digite m ou f.");
                 	}
                 	
                } while (!valide);
                
                valide = false;
                
                do {
               	 
               	 System.out.println("Digite  seu estado Civil: 'c', 's', 'v' ou 'd'");
               	 estCivil = in.next();
                  
                 	if(estCivil.equalsIgnoreCase("c") || 
                 	   estCivil.equalsIgnoreCase("s") ||
                 	   estCivil.equalsIgnoreCase("v") ||
                 	  estCivil.equalsIgnoreCase("d")) {
                 		
                       valide = true;
                 	}else {
                 		System.out.println("sexo invalido, digite m ou f.");
                 	}
                 	
                } while (!valide);
                    	 
                     System.out.println("As seguinte informações foram coletadas:");
                     System.out.println("Seu nome é: "+nome);
                     System.out.println("Sua idade é: "+idade);
                     System.out.println("Seu salario  é: "+salario);
                     System.out.println("Seu sexo é: "+sexo);
                     System.out.println("Seu estado civil é: "+estCivil);
	}
	
}
	
	
	





          	    










