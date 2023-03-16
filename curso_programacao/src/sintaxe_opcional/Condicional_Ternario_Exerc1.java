package sintaxe_opcional;

import java.util.Locale;
import java.util.Scanner;

public class Condicional_Ternario_Exerc1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner LerInt = new Scanner(System.in);
		
		int a = 1;
		int b = 0;
				
		System.out.println("Digite seu ano de nascimento: ");
		int idade = LerInt.nextInt();
		int alist = (2023 - idade);
		int servir = (alist == 18) ? a : b ;
		System.out.println("1 = Você vai servir // 0 = Você não irá servir");
		System.out.println(servir);
		
		
		
		
		LerInt.close();
	}

}
