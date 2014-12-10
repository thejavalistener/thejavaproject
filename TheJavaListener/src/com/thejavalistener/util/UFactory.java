package com.thejavalistener.util;

import java.io.FileInputStream;
import java.util.Properties;

public class UFactory
{
	public static Object getInstance(String name)
	{
		String filename = "ufactory.properties";
		try(FileInputStream fis = new FileInputStream(filename))
		{
			// leo las properties (objectName=classImple) desde el archivo
			Properties p = new Properties();
			p.load(fis);
			
			// obtengo el classname asociado a este name
			String sClassImple = p.getProperty(name);
			
			// lo instancio y retorno la instancia solicitada
			
			return Class.forName(sClassImple).newInstance();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}
}
