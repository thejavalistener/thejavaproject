package com.thejavalistener.post.comparator;

import java.util.Scanner;

public class ComparaCadenas3
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
		
		if(s1.compareTo(s2)<0)
		{
			System.out.println("s1 es alfabeticamente MENOR que s2");
		}
		else
		{
			if(s1.compareTo(s2)>0)
			{
				System.out.println("s1 es alfabeticamente MAYOR que s2");
			}
			else
			{
				System.out.println("s1 es IGUAL que s2");
			}
		}
	}
}
