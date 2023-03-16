package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dia = 24;
		System.out.println("Hora do início: ");
		int inicio = sc.nextInt();
		System.out.println("Hora do fim: ");
		int fim = sc.nextInt();
		
		int duracao;
		
		if (inicio < fim) {
			duracao = fim - inicio;
		}
		else {
			duracao = dia - inicio + fim;
		}
		
		System.out.println("O jogo durou " + duracao + "horas");
		sc.close();
	}

}
