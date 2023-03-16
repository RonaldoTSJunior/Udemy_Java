package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("É PAR!");
		}
		else {
			System.out.println("É IMPAR!");
		}
		
		sc.close();
	}

}
