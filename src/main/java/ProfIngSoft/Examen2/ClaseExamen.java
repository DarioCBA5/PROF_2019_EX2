package ProfIngSoft.Examen2;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {
	
	public static List<Integer> primos (int n) throws EntradaInvalida
	{
		if(n<=1)
		{
			throw new EntradaInvalida();
		}
		
		List<Integer> Lista_final = new ArrayList<Integer>();
		for (int i=2; i<=n; i++)
		{
			while(n%i == 0)
			{
				Lista_final.add(i);
				n = n/i;
			}
		}
		return Lista_final;
	}
}
