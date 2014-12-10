package com.thejavalistener.util.beancmp;

import java.util.Comparator;

import com.thejavalistener.util.UBean;

public class BeanComparator<T> implements Comparator<T>
{	
	private String[][] keys = null;
	
	public BeanComparator(String pkline)
	{
		// explorar la cedana y la separa en pares (signo,key)
		keys = UIndex.getKeys(pkline);
	}
	
	@Override
	public int compare(T o1, T o2)
	{
		for(int i=0; i<keys.length; i++)
		{
			// tomo el i-esimo atributo de la clave
			String key = keys[i][UIndex.KEY];
			
			// obtengo los valores a comparar
			Comparable<T> value1 = (Comparable<T>)UBean.invokeGetter(o1, key);
			Comparable<T> value2 = (Comparable<T>)UBean.invokeGetter(o2, key);
			int comp = value1.compareTo((T)value2);
			
			// obtengo el signo
			char sign = keys[i][UIndex.SIGN].charAt(0);
			 
			
			// si los dos valores son iguales => paso al proximo
			if( comp==0 )
			{
				continue;
			}
			
			// v1 es mayor que v2
			if( comp>0 )
			{
				if( sign=='+' )
				{
					return 1;
				}
				else // v1 es menor que v2
				{
					return -1;
				}
			}
			else
			{
				if( sign=='+' )
				{
					return -1;
				}
				else // v1 es menor que v2
				{
					return 1;
				}
			}
		}
		
		return 0;
	}
}
