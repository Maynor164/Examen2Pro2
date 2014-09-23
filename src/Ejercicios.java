import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList; 
//*TRABAJO EN GRUPO
//*Alex Escoto
//*Maverick del Cid
//*Iveth Sabillon
//*Walter Valle
//*Kevin Lanza

public class Ejercicios {
	
	//Devuelve true si todos los elementos de 'mi_lista' son pares, de lo contrario devuelve false
	static boolean sonPares(ArrayList<Integer> mi_lista)
{
//Variable para almacenar los numeros pares
		int pares=0;
//Buscar en el array
		for(int i=0;i<mi_lista.size();i++)
	{
//Evaluamos si los numeros son pares
			if(mi_lista.get(i)%2==0)
		{
				pares++;
		}
		if(pares==mi_lista.size()){
//Si son pares regresa true de lo contrario es impar y regresa false
			return true;
		}
	}
		
		return false;
}	
		
	
	//Devuelve el numero menor almacenado en 'mi_lista'
	static int getMenor(ArrayList<Integer> mi_lista)
	{
		{
//Creamos una variable para saber
			int menor = mi_lista.get(0);
				
				for(int i = 0; i < mi_lista.size(); i++)
				{
//Evaluamos cual de los numeros de la lista es el menor con nuestra variable
					if (mi_lista.get(i) < menor )
					{
//Almacenamos el numero menor de la lista en nuestra variable
						menor = mi_lista.get(i); 
					}
				}
//Devuelve el numero menor 
				return menor; 
		}
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	static int getNumeroMayor(String nombre_archivo)
{
//Creamos nuestra variable con un margen alto de numero
	int mayor = -9999;
//Ponemos try para poder escribir en el archivo
		try
		{
//Creamos el archivo y le asignamos el valor de nuestra variable
			File archivo = new File(nombre_archivo);
			Scanner s = new Scanner (archivo);
//.hasNext para que revisa todos lo del archivo
			while(s.hasNext())
			{
//Ingresamos el numero
				int num = s.nextInt();
//Evaluamos si el numero ingresado es mayor
				if (num > mayor)
//Luego si el numero de la variable es menor toma su valor
					mayor=num;
				}
//Evaluamos si hay algun error
			}catch (Exception e)
			{
				e.printStackTrace();
			}
//Regresamos el valor de nuestra variable
		return mayor;
						
}
	
	
	//Devuelve cuantas veces existe la string buscada en el archivo con nombre nombre_archivo
	static int cuantasVecesExiste(String nombre_archivo, String buscada)
{
//Creamos nuestras variable una que busque y la otra que almacene cuantas veces existe
	int buscador=0;
	int vec_existe=0;
//Ponemos try para poder escribir en el archivo	
		try
	{
//Creamos el archivo y le asignamos el valor de nuestra variable
			File archivo = new File(nombre_archivo);
			Scanner s = new Scanner (archivo);
//.hasNext para que revisa todos lo del archivo
			while(s.hasNext())
			{	
				String resultado = s.next();
//Evaluamos para realizar nuestra busqueda y lo almacenamos en nuestra variable vec_existe
				if (resultado.equals(buscada)){
					vec_existe++;
					}
				}
//Luego le asignamos el valor a nuestra varible buscador
				buscador=vec_existe;
//Evaluamos si hay algun error			
				}catch (Exception e)
					{
						e.printStackTrace();
					}
//Regresamos el valor de nuestra variable
		return buscador;
	}
}
