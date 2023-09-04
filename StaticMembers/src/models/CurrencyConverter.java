package models;


public class CurrencyConverter { 
	
	
	public static double DOLLAR;
	public static double IOF  = 0.06;
	
	
	public static double BuyDollar(double money) 
	{
		
		double pay = DOLLAR * money;
		
			double tax = pay  * IOF;
				return pay + tax;
	}

}
