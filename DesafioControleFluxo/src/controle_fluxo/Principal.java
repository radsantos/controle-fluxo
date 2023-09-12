package controle_fluxo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			System.out.println("Digite o primeiro parâmetro: ");
			int primeiro  = sc.nextInt();
			
			System.out.println("Digite o segundo parâmetro: ");
			int segundo  = sc.nextInt();
			
			Contador contador = new Contador(primeiro, segundo);
			
			System.out.println(contador.contar());
			
			
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		
	}

}
