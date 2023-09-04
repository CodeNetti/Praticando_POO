package application;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

import models.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Informe a cotação do Dollar em Real Brasileiro atualmente");
        Scanner sc = new Scanner(System.in);
		CurrencyConverter.DOLLAR  = sc.nextDouble();
		System.out.println("Quantos Dólares deja comprar?");
		double money= sc.nextDouble();
		System.out.println("Para comprar esse valor em Dollar o preço é " + CurrencyConverter.BuyDollar(money));
		
		
		

	}

}
