import java.util.Scanner;

public class ex_if_else05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Código || Especificação || Preço\n"
				+ "1      ||    hot dog    || R$4.00\n"
				+ "2      ||   X - salada  || R$4.50\n"
				+ "3      ||   X - Bacon   || R$5.00\n"
				+ "4      || Torrada comun || R$2.00\n"
				+ "5      || Refrigerante  || R$1.50");
		
		double HotDog = 4.0, XSalada = 4.50, XBacon = 5.0, Torrada = 2.0, Refri = 1.50, total = 0;
		
		System.out.println("Digite o código do produto desejado");
		int codigo = sc.nextInt();
		System.out.println("Quantas unidades? ");
		int unidades = sc.nextInt();
		
		if(codigo == 1) {
			total = HotDog*unidades;
		}else if(codigo == 2) {
			total = XSalada*unidades;
		}else if(codigo == 3) {
			total = XBacon*unidades;
		}else if(codigo == 4) {
			total = Torrada*unidades;
		}else if(codigo == 5) {
			total = Refri*unidades;
		}else {
			System.out.println("Código inválido");
		}
		
		System.out.println("Total: R$ "+ total);
		
		sc.close();
	}

}
