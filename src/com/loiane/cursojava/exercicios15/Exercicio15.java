package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

           Scanner in = new Scanner(System.in);
           
           System.out.println("Informe primeiro lado do tri�ngulo: ");
           int lado1 = in.nextInt();
           
           System.out.println("Informe segundo lado do tri�ngulo: ");
           int lado2 = in.nextInt();
           
           System.out.println("Informe terceiro lado do tri�ngulo: ");
           int lado3 = in.nextInt();
           
           if (lado1 + lado2 > lado3 && lado1 == lado2 && lado2 == lado3) {
           System.out.println("Tri�ngulo Equil�tero");
           
           } else if (lado1 == lado2 || lado2 == lado3) {
        	System.out.println("Tri�ngulo Is�sceles");   
           }else if (lado1 != lado2 && lado2 != lado3) {
        	System.out.println("Tri�ngulo Escaleno");   
           }else {
        	   System.out.println("N�o � tri�ngulo");
           }
           
        }
           

	}


