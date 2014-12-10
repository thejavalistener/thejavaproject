package com.thejavalistener.post.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.thejavalistener.foo.Persona;
import com.thejavalistener.util.UDate;

public class OrdenaPersonas2
{
public static void main(String[] args)
{
List<Persona> listaPersonas = obtenerPersonas();
// ordeno x DNI
System.out.println("----- Ordenado por DNI -----");
Collections.sort(listaPersonas,new Comparator01ImpleDNI());
for(Persona p: listaPersonas)
{
System.out.println(p);
}
// ordeno x nombre+dni
System.out.println("----- Ordenado por nombre+DNI -----");
Collections.sort(listaPersonas,new Comparator02ImpleNombre());
for(Persona p: listaPersonas)
{
System.out.println(p);
}
 
// ordeno x fechaNacimiento+nombre
System.out.println("----- Ordenado por fecha+nombre -----");
Collections.sort(listaPersonas,new Comparator03ImpleFechaNacimiento());
for(Persona p: listaPersonas)
{
System.out.println(p);
}
 
}
private static List<Persona> obtenerPersonas()
{
ArrayList<Persona> lista = new ArrayList<>();
lista.add( new Persona(3020,"Pablo",new Date(UDate.stringToLong("1970/10/2"))));
lista.add( new Persona(1060,"Juan",new Date(UDate.stringToLong("1985/6/14"))));
lista.add( new Persona(2040,"Pedro",new Date(UDate.stringToLong("1991/3/26"))));
return lista;
}
}