import java.util.Scanner;

public class ex_if_else03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números para saber se são múltiplos ou não");
		System.out.println("Primeiro número: ");
		int numero1 = sc.nextInt();
		System.out.println("Segundo número: ");
		int numero2 = sc.nextInt();
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("São múltiplos");
		}else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();
	}

}
