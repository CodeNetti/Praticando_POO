package application;

import java.util.Locale;
import java.util.Scanner;

import myShop.Product;

public class Program {

	
	public static void main(String[] args) {
		Product prod = new Product();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor coloque os dados do produto");
		System.out.println("Qual é o nome do produto?");
		prod.name = sc.nextLine();
		System.out.println("Qual é o preço do produto?");
		prod.price = sc.nextDouble();
		System.out.println("Qual é a quantidade em estoque?");
		prod.quantity = sc.nextInt();
		
		
		
		System.out.println("Dados do Produto, " + prod.name + ", $" + prod.price + " , " + prod.quantity + " Unidades, Total: $ " + (prod.quantity * prod.price));
	
		System.out.println("Digite a quantidade de produtos que deseja inserir no estoque");
		
		int insertProd = sc.nextInt();
		
		prod.AddProducts(insertProd);
		
		System.out.println("Estoque de " + prod.name + ", Unidades: " + prod.quantity + " Total: $" + (prod.quantity * prod.price));
		
		System.out.println("Digite a quantidade de produtos que deseja retirar do estoque");
		
		int removeProd = sc.nextInt();
		
		prod.RemoveProducts(removeProd);
		
		System.out.println("Estoque de " + prod.name + ", Unidades: " + prod.quantity + " Total: $" + (prod.quantity * prod.price));
		
		
		sc.close();

	}

}
