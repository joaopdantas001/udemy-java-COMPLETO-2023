import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double raio, area, pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite o valor do raio de um círculo: ");
		
		raio = sc.nextDouble();
		
		area =  pi * raio * raio;
		
		System.out.printf("A= " + "%.4f", area);
	
	}
}
		
		
		
