import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.35764;
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;
		System.out.println(x);          // Print com quebra de linha.
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x); // Print formatado e com casas decimais.
		Locale.setDefault(Locale.US);   // Configurando a localização do programa
		System.out.printf("%.4f%n", x); // Valor printado no console com a config da Localização definida.
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO= %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
