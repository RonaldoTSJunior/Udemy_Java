package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;
public class exerc1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número inteiro para verificação: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
