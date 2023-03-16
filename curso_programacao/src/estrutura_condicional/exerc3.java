package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("SÃO MULTIPLOS");
		}
		else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		
		
		sc.close();
	}

}
