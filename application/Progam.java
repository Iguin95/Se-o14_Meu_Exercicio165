package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: "); //Insira o número de contribuintes:
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1;i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? "); //Pessoa física ou jurídica (e/c)?
			char op = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: "); //ganho anual
			Double anuaullncome = sc.nextDouble();
			
			if(op == 'i') {
				System.out.print("Health expenditures: ");//Despesas com saúde:
				Double healthExpenditures = sc.nextDouble();
				TaxPayer tP = new Individual(name, anuaullncome, healthExpenditures);
				list.add(tP);
			}else if(op == 'c') {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				TaxPayer tP = new Company(name, anuaullncome, numberOfEmployees);
				list.add(tP);
			}
			
		}
		
		System.out.println();
		double sum = 0.0;
		System.out.println("TAXES PAID:");
		for(TaxPayer tP : list) {
			System.out.println(tP.getName() + ": $" + tP.tax());
			sum = sum + tP.tax();
		}
		
		System.out.printf("TOTAL TAXES: $%.2f", sum);
		
		sc.close();

	}

}
