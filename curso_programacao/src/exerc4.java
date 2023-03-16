import java.util.Locale;
import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Numero, Horas;
		double ValorHora, Salario;
		
		System.out.print("Informe o código do funcionário: ");
		Numero = sc.nextInt();
		System.out.print("Informe as horas trabalhadas: ");
		Horas = sc.nextInt();
		System.out.print("Informe o valor da hora trabalhada: R$ ");
		ValorHora = sc.nextDouble();
		Salario = Horas * ValorHora;
		
		System.out.println("Número do funcionário: " + Numero);
		System.out.printf("Salário R$ %.2f%n", Salario);
		
		
		
		sc.close();
	}

}
