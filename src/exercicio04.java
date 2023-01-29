import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		int matricula, horas, minutos;
		int matriculaTamanho, horasTamanho, minutosTamanho, valorTamanho;
		String matriculaString, horasString, minutosString, valorString;
		double minutosConvertido, valor, horasTrabalhadas, salario;
		boolean valido= true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("vamos calcula o salário desse funcionário.");
		System.out.println("---------------------------------------");
		do 
		{
			System.out.println("*lembrando, a matricula so contem numeros*");
			System.out.print("digite a mantricula do funcionario: ");
			matriculaString = sc.next();
            matriculaTamanho = matriculaString.length();
            for (int i = 0; i < matriculaTamanho; i++) 
            {
            	valido = matriculaString.matches("[a-zA-Z]");
            	
            }
        } while (valido != false);
		matricula = Integer.parseInt(matriculaString);
		valido = true;
		
		System.out.println("---------------------------------------");
		
		System.out.println("vamos digitar o numero de horas trabalhas.");
		System.out.println("digitaremos o numero de horas e de minutos separados.");
		do 
		{
			System.out.print("Digite o numero de horas trabalhadas: ");
			horasString = sc.next();
			horasTamanho = horasString.length();
			for (int i = 0; i < horasTamanho; i++)
			{
				valido = horasString.matches("[a-zA-Z]");
            	// System.out.println(valido);
			}
		} while (valido != false);
		horas = Integer.parseInt(horasString);
		valido = true;
		
		do 
		{
			System.out.print("Digite o numero de minutos trabalhados: ");
			minutosString = sc.next();
			minutosTamanho = minutosString.length();
			for (int i = 0; i < minutosTamanho; i++)
			{
				valido = minutosString.matches("[a-zA-Z]");
            	// System.out.println(valido);
			}
		} while (valido != false);
		minutos = Integer.parseInt(minutosString);
		valido = true;
		
		minutosConvertido = minutos / 60;
		
		horasTrabalhadas = horas + minutosConvertido;
		
		System.out.println("---------------------------------------");
		
		do 
		{
			System.out.print("Digite o valor da hora trabalhada: ");
			valorString = sc.next();
			valorTamanho = valorString.length();
			for (int i = 0; i < valorTamanho; i++)
			{
				valido = valorString.matches("[a-zA-Z]");
            	// System.out.println(valido);
			}
		} while (valido != false);
		valor = Double.parseDouble(valorString);
		valido = true;
		
		salario = horasTrabalhadas * valor;
		
		System.out.println("---------------------------------------");

		System.out.print("O numero de horas trabalhadas foi: ");
		System.out.printf( "%.2f\n", horasTrabalhadas);
		System.out.println("O salario ficou em: ");
		System.out.printf( "%.2f", salario);
		
	}
}
