package com.thejavalistener.post.simple;

import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
		// scanner me permite leer datos por consola
		Scanner scanner = new Scanner(System.in);
		
		// el usuario ingresa un valor numerico
		System.out.print("Ingrese un valor numerico: ");
		int n = scanner.nextInt();
		
		double fib = fibonacci(n);
		
		System.out.println("El termino "+n+" de Fibonacci es: "+fib);
	}
	
	private static double fibonacci(int n)
	{
		if( n<=2 )
		{
			return 1;
		}
		else
		{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
}
