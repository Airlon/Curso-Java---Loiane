package com.loiane.cursojava.exercicios17;

public class Exercicio4 {

	public static void main(String[] args) {

        double a = 80000, b=200000;
        
        int ano = 0;
        
        do {
        	   a = a+a*0.03;
        	   b = b+b*0.015;
        	   
        	  ano = ano +1;
        	   
        }while (a<=b);
        
        System.out.println("Anos: "+ano);
        	
        } 
        

	}


