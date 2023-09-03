package application;

import java.util.Locale;
import java.util.Scanner;

import company.Employee;

public class Program {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Registro de funcionário");
		System.out.println("Qual é o nome do funcionário?");
		employee.name = sc.nextLine();
		System.out.println("Qual é o salario bruto deste funcionário?");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Qual é o valor total dos descontos?");
		employee.tax = sc.nextDouble();
		
		System.out.println("Funcionário: " + employee.name + " Salario líquido $" + employee.NetSalary());
		
		
		System.out.println("Deseja dar um aumento para o "  + employee.name + " ?");
		System.out.println("Digite S para sim e N para Não");
		String confirmação = sc.next();
		if(confirmação.equals("S")) 
		{
			 
			 System.out.println("Qual é a porcentagem do aumento?");
			 double percentage = sc.nextDouble();
			 employee.IncreaseSalary(percentage);
			 
			 System.out.println("Registro de funcionário atualizado " + employee.name + ", $" + employee.grossSalary);
		}
		else if(confirmação.equals("N")) 
		{
			System.out.println("Ok, muito obrigado, volte sempre");
			
		}
		
		

	}

}
