import java.util.Locale;
import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, pi, vlrRaio, raio;
		
		pi =  3.14159;
		System.out.print("Digite o valor do raio: ");
		vlrRaio = sc.nextDouble();
		System.out.printf("O valor do seu raio é: %.2f%n", vlrRaio);
		System.out.println("Calculando area...");
		raio = vlrRaio * vlrRaio;
		area = pi * raio;
		System.out.printf("O valor da sua area é %.4f%n", area);
		
		
		sc.close();
	}

}
