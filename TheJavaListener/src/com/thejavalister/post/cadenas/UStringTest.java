package com.thejavalister.post.cadenas;

import com.thejavalistener.util.UString;

public class UStringTest
{
	public static void main(String[] args)
	{
		// estos son los valores que vamos a mostrar
		int[] valores= {5, 23, 4, 132, 83, 4612, 3, 7};
		
		// a lo sumo esperamos valores de nDig digitos
		int nDig=7;
		for(int v:valores)
		{
			System.out.println(UString.padInt(v,nDig));
		}
	}
}