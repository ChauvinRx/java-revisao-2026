import java.util.Scanner;

public class ex_if_else02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se é par ou ímpar");
		int numero = sc.nextInt();
		if (numero%2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é ímpar");
		}
		sc.close();
	}

}
