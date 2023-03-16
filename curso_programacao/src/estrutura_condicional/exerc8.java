package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exerc8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, ir, irr;
		
		System.out.println("Informe seu salário em Rombus: R$ ");
		salario = sc.nextDouble();
		System.out.println("Calculando Imposto de Renda... ");
		
		if (salario >= 0 & salario <= 2000) {
			System.out.println("ISENTO");
		}
		
		else if (salario >= 2000.01 & salario <= 3000) {
				ir = salario * 0.8;
				System.out.printf("Imposto de Renda R$ %.2f", ir);
		}
		
		else if (salario == 3002.00) {
				irr = 1000 * 0.08;
				ir = (2.00 * 0.18) + irr;
				System.out.printf("Imposto de Renda R$ %.2f", ir);
		}
		
		else if (salario >= 3000.01 & salario <= 4500) {
				ir = salario * 0.18;
				System.out.printf("Imposto de Renda R$ %.2f", ir);
		}
		
		else if (salario > 4500) {
				ir = ((salario - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
				System.out.printf("Imposto de Renda R$ %.2f", ir);
		}
						
		sc.close();
	}
}
