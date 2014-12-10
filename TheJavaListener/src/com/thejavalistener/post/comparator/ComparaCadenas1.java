package com.thejavalistener.post.comparator;

import java.util.Scanner;

public class ComparaCadenas1
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		// ingreso la primera cadena
		System.out.print("Ingrese la cadena 1: ");
		String s1=scanner.next();
		
		// ingreso la segunda cadena
		System.out.print("Ingrese la cadena 2: ");
		String s2=scanner.next();
		
		if(s1==s2)
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("Son distintas");
		}
	}
}
