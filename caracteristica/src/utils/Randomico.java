package utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Randomico
{
	public Randomico(){};
	
	
	public int Sorteio(int a, int b)
	{
		Random r = new Random(Calendar.getInstance().getTimeInMillis());
		int valor = r.nextInt(2);
		return valor==0?a:b;
	}
	public int Sorteio(ArrayList<Integer> valores)
	{
		Random r = new Random(Calendar.getInstance().getTimeInMillis());
		int valor = r.nextInt(valores.size());
		return valores.get(valor);
	}
	public int Sorteio(int teto)
	{
		Random r = new Random(Calendar.getInstance().getTimeInMillis());
		int valor = r.nextInt(teto);
		return valor;
	}
	
}
