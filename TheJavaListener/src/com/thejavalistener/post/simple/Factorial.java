package com.thejavalistener.post.simple;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		// scanner me permite leer datos por consola
		Scanner scanner = new Scanner(System.in);
		
		// el usuario ingresa un valor numerico
		System.out.print("Ingrese un valor numerico: ");
		int n = scanner.nextInt();
		
		// calculo su factorial (se desarrolla mas abajo)
		double f = factorialIterativo(n);
		
		// muestro el resultado
		System.out.println("el factorial("+n+") es: "+ f);
		
		// cierro vinculo con la consola
		scanner.close();
	}
	
	private static double factorialIterativo(int n)
	{
		double tmp = 1;
		
		for( int i=n; i>1; i-- )
		{
			tmp = tmp*i;
		}
		
		return tmp;
	}
	
	private static double factorialRecursivo(int n)
	{
		if( n==1 )
		{
			return 1;
		}
		else
		{
			return n*factorialRecursivo(n-1);
		}
	}
}
