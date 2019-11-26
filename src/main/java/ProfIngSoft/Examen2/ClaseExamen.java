package ProfIngSoft.Examen2;

public class ClaseExamen {
	
	public static int[] primos (int n)
	{
		int j = 0;
		int[] Lista_final;
		for (int i=2; i<n; i++)
		{
			while(n%i == 0)
			{
				Lista_final[j] = n/i;
				j++;
			}
		}
		
	}
	
}
