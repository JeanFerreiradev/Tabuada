package beecrowd;

import java.util.Scanner;

public class Tabuada {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;
		int multiplicador = 0;
		System.out.println("Digite um n�mero (Obs: N�mero > 2):");
		num = console.nextInt();
		while (num <= 2 || num >= 1000) {
			System.out.println("N�mero inv�lido, digite novamente:");
			num = console.nextInt();
		}
		for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println(multiplicador + " x " + num + " = " + multiplicador * num);
		}
		
		
		
		
		
		
		

	}

}
