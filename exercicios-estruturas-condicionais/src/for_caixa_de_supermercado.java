import java.util.Scanner;

public class for_caixa_de_supermercado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pares =0, impar =0, soma = 0;
		
		System.out.println("Classificando números:\n"
				+ "Digite 10 números.");
		for(int i=1;i<= 10;i++) {
			int numero = sc.nextInt();
			if(numero %2 == 0) {
				pares++;
			}else {
				impar++;
			}
			soma += numero;
		}
		System.out.println("Pares: "
				+ pares + "\nÍmpares: " + impar +
				"\nSoma: " + soma);
		
		
		
		sc.close();
	}

}
