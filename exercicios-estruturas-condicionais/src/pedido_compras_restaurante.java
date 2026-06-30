import java.util.Scanner;

public class pedido_compras_restaurante {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int unidadesHamb = 0;
		int unidadesPizza = 0;
		int unidadesRefri = 0;
		boolean pedidoFinalizado = false;
		
		do {
		System.out.println("===== Menu ===== \n"
				+ "1 - Hambúrguer \n"
				+ "2 - Pizza \n"
				+ "3 - Refrigerante \n"
				+ "4 - Concluir pedido");
		int opcao = sc.nextInt();
		switch(opcao) {
		case 1: System.out.println("Quantas unidades?");
		unidadesHamb += sc.nextInt();
		break;
		
		case 2: System.out.println("Quantas unidades?");
		unidadesPizza += sc.nextInt();
		break;
		case 3: System.out.println("Quantas unidades?");
		unidadesRefri += sc.nextInt();
		break;
		case 4: pedidoFinalizado = true;
		break;
		default: System.out.println("Opção inválida");
		break;
		}
		
		}while(!pedidoFinalizado);
		System.out.println("Pedido: " + unidadesHamb + " hambúguers \n"
				+ unidadesPizza + " Pizzas \n"
				+ unidadesRefri + " refrigerantes");
		sc.close();
	}

}
