import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.println("Digite um Número Inteiro: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite Outro Inteiro: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("SOMA = " + soma);
		
	}

}
