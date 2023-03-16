import java.util.Locale;
import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int A, B, C, D, DIFERENCA;
		
		
		System.out.print("Digite o valor de A: ");
		A = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		B = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		C = sc.nextInt();
		System.out.print("Digite o valor de D: ");
		D = sc.nextInt();
		System.out.println("Calculando...");
		
		DIFERENCA = (A * B) - (C * D);
		
		System.out.print("DIFERENÇA = " + DIFERENCA);
		
		sc.close();
	}

}
