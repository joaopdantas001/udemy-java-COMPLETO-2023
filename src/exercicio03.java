import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		int a, b, c, d, difereca_produto;
		double resto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("vamos fazer a diferença do produto de A e B pelo produto de C e D !");
		System.out.println("quando multiplicamos valores, o resultado dessa multiplicação é chamado produto.");
		System.out.println("a diferença é o resultado quando realizamos uma operação de subtração.");
		System.out.println("Vamos lá ?");
		do{
			System.out.println("Digite um número inteiro para A");
			a = sc.nextInt();
			resto = a % 2;
		} while(resto != 0.0);
		do{
			System.out.println("Digite um número inteiro para B");
			b = sc.nextInt();
			resto = b % 2;
		} while(resto != 0.0);
		do{
			System.out.println("Digite um número inteiro para C");
			c = sc.nextInt();
			resto = c % 2;
		} while(resto != 0.0);
		do{
			System.out.println("Digite um número inteiro para D");
			d = sc.nextInt();
			resto = d % 2;
		} while(resto != 0.0);
		
		difereca_produto = (a * b) - (c * d);
		
		System.out.println("DIFERENCA = " + difereca_produto);

	}


}
