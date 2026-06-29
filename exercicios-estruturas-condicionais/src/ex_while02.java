import java.util.Scanner;

public class ex_while02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean sair = false;
		int x;
		double saldo = 1000;
		
		do {
		System.out.println("===== Caixa eletrônico =====");
		System.out.println("1- Consultar saldo \n"
				+ "2- Depositar \n"
				+ "3- Sacar \n"
				+ "4- Sair");
		x = sc.nextInt();
		switch(x) {
			case 1: System.out.println("Seu saldo é: " + saldo);
				break;
			case 2: System.out.println("Digite o valor: ");
				double deposito = sc.nextDouble();
					if(deposito <= 0) {
						System.out.println("Valor inválido");
					}else {
						saldo += deposito;
					}break;
			case 3: System.out.println("Digite valor de saque: ");
				double saque = sc.nextDouble();
					if(saque > saldo) {
						System.out.println("Saldo insuficiente");
					}else if(saque <= 0) {
						System.out.println("valor inválido");
					}else {
						saldo -= saque;
						System.out.println("Saque realizado com sucesso!");
					}break;
			case 4: sair = true;
				break;
				default: System.out.println("Opção inválida!");
					break;
		}
		}while(!sair);
		
		sc.close();
	}

}
