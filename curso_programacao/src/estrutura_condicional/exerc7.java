package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exerc7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Informe um valor para X com uma casa decimal: ");
		x = sc.nextDouble();
		System.out.println("Informe um valor para y com uma casa decimal: ");
		y = sc.nextDouble();
		
		if (x > 0 & x < 5 & y > 0 & y < 5) {
			System.out.println("Q1");
		}
		else {
			if (x > 0 & x < 5 & y < 0 & y < 5) {
				System.out.println("Q4");
			}
			else {
				if (x < 0 & x < 5 & y > 0 & y < 5) {
					System.out.println("Q2");
				}
				else {
					if (x < 0 & x < 5 & y < 0 & y < 5) {
						System.out.println("Q3");
					}
					else {
						if (x == 0 & y == 0) {
							System.out.println("Origem");
						}
						else {
							if (x > 5 || y > 5) {
								System.out.println("Valor máximo para eixo X e eixo Y é 5");
							}
							else {
								if (x == 0 & y > 0 & y <= 5) {
								System.out.println("Eixo Y");
								}
								else {
									if (y == 0 & x > 0 & x <= 5);
									System.out.println("Eixo X");
								}
							}
						}
					}
				}
			}
		}	
		sc.close();
	}

}
