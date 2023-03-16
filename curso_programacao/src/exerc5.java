import java.util.Locale;
import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, Triangulo, Trapezio, Circulo, Quadrado, Retangulo;
		
		System.out.print("Informe o valor de A = ");
		a = sc.nextDouble();
		System.out.print("Informe o valor de B = ");
		b = sc.nextDouble();
		System.out.print("Informe o valor de C = ");
		c = sc.nextDouble();
		
		Triangulo = (a * c) / 2;
		Trapezio = (a + b) * c / 2;
		Circulo = (c * c) * 3.14159;
		Quadrado = b * b;
		Retangulo = a * b;
		
		System.out.printf("Triângulo = %.3f%n", Triangulo);
		System.out.printf("Trapézio = %.3f%n", Trapezio);
		System.out.printf("Circulo = %.3f%n", Circulo);
		System.out.printf("Quadrado = %.3f%n", Quadrado);
		System.out.printf("Retângulo = %.3f%n", Retangulo);
		
		
		
		sc.close();
	}

}
