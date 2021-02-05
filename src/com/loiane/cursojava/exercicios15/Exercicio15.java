package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

           Scanner in = new Scanner(System.in);
           
           System.out.println("Informe primeiro lado do triângulo: ");
           int lado1 = in.nextInt();
           
           System.out.println("Informe segundo lado do triângulo: ");
           int lado2 = in.nextInt();
           
           System.out.println("Informe terceiro lado do triângulo: ");
           int lado3 = in.nextInt();
           
           if (lado1 + lado2 > lado3 && lado1 == lado2 && lado2 == lado3) {
           System.out.println("Triângulo Equilátero");
           
           } else if (lado1 == lado2 || lado2 == lado3) {
        	System.out.println("Triângulo Isósceles");   
           }else if (lado1 != lado2 && lado2 != lado3) {
        	System.out.println("Triângulo Escaleno");   
           }else {
        	   System.out.println("Não é triângulo");
           }
           
        }
           

	}


