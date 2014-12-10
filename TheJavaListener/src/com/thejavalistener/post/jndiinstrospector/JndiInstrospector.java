package com.thejavalistener.post.jndiinstrospector;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;

public class JndiInstrospector
{
    public static void print()
    {
		try
        { 
            Context ctx = new InitialContext();
            String n = ctx.getNameInNamespace();
            _print(n);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            throw new RuntimeException();
        }
    }
    
    private static void _print(String name) throws Exception
    {
        try
        {
            System.out.println("Name in manespace: "+name);
            Context ctx = new InitialContext();
            NamingEnumeration<Binding> list = ctx.listBindings(name);
            
            while( list.hasMoreElements() )
            {
                Binding b = list.nextElement();
                String s = b.getName();
                
                _print(name+"/"+s);
            }   
        }
        catch(Exception ex)
        {
            // ignore
        }
    }
}
