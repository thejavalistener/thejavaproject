package com.thejavalistener.post.simple;

public class DemoArrays
{
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++)
		{
			// genero un numero random entre 0 y 99
			arr[i] = (int)(Math.random()*100);
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
