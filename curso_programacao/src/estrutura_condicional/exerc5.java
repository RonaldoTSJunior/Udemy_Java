package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cod, qntd, tot;
		
		System.out.println("1 - Cachorro Quente   = R$ 4.00");
		System.out.println("2 - X-Salada          = R$ 4.50");
		System.out.println("3 - X-Bacon           = R$ 5.00");
		System.out.println("4 - Torrada Simples   = R$ 2.00");
		System.out.println("5 - Refrigerante      = R$ 1.50");
		
		System.out.println();
		System.out.println("Digite o código do produto: ");
		cod = sc.nextDouble();
		System.out.println("Digite a quantidade que deseja: ");
		qntd = sc.nextDouble();
		
		if (cod == 1) {
			tot = qntd * 4.00;
			System.out.printf("Você escolheu < Cachorro Quente > e %.2f unidades. TOTAL R$ %.2f", qntd, tot);
		}
		else {
			if (cod == 2) {
				tot = qntd * 4.50;
				System.out.printf("Você escolheu < X-Salada > e %.2f unidades. TOTAL R$ %.2f", qntd, tot);
			}
			else {
				if (cod == 3) {
					tot = qntd * 5.00;
					System.out.printf("Você escolheu < X-Bacon > e %.2f unidades. TOTAL R$ %.2f", qntd, tot);
				}
				else {
					if (cod == 4) {
						tot = qntd * 2.00;
						System.out.printf("Você escolheu < Torrada Simples > e %.2f unidades. TOTAL R$ %.2f", qntd, tot);
					}
					else {
						if (cod == 5) {
							tot = qntd * 1.50;
							System.out.printf("Você escolheu < Refrigerante > e %.2f unidades. TOTAL R$ %.2f", qntd, tot);
						}
						else {
							System.out.println("< Código inexistente! >");
						}
					}
				}
			}
		}
		
		
		
		
		sc.close();
	}

	}
