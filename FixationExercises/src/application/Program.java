package application;

import java.util.Locale;
import java.util.Scanner;

import calcs.Types;

public class Program {

	public static void main(String[] args) {
		Types Rectangle = new Types(); 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a largura e a altura de um retângulo");
		
		double Width = sc.nextDouble();
		double Heigth = sc.nextDouble();
		System.out.println("Área = " + Rectangle.Area(Heigth, Width));
		System.out.println("Perímetro = " + Rectangle.Perimeter(Heigth, Width));
		System.out.println("Diagonal = " + Rectangle.Diagonal(Heigth, Width));
        sc.close();
	}

}
