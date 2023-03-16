import java.util.Locale;
import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int vlr1, vlr2, soma;
		System.out.print("Digite o primeiro número inteiro: ");
		vlr1 = sc.nextInt();
		System.out.println("Primeiro número: " + vlr1);
		System.out.print("Digite o segundo número inteiro: ");
		vlr2 = sc.nextInt();
		System.out.println("Segundo número: " + vlr2);
		soma = vlr1 + vlr2;
		System.out.print("A soma dos valores é: " + soma);
				
		sc.close();
	}

}
