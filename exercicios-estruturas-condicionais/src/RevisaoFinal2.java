import java.util.Scanner;

public class RevisaoFinal2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os numeros: ");
		double numero1 = sc.nextDouble();
		double numero2 = sc.nextDouble();
		double numero3 = sc.nextDouble();
		double resultado = calcularMedia(numero1, numero2, numero3);
		System.out.println("A média é: " + resultado);
		
		
		sc.close();
	}
public static double calcularMedia(double a, double b, double c) {
		double soma = a+b+c;
		double media = soma/3;
		return media;
	}

}
