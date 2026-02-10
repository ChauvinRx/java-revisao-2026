import java.util.Locale;
import java.util.Scanner;

public class ex_if_else06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um valor qualquer para identificar em qual intervalo ele se encaixa");
		double valor = sc.nextDouble();
		
		System.out.println("Tabela de intervalos: \n [0,25] intervalo 1\n"
				+ " [25,50] intervalo 2 \n [50,75] intervalo 3 \n [75,100] intervalo 4");
		
		if(valor < 0) {
			System.out.println("Fora de intervalo");
		}else if((valor >= 0) && (valor <= 25)) {
			System.out.println("Intervalo 1");
		}else if((valor > 25) && (valor <= 50)) {
			System.out.println("Intervalo 2");
		}else if((valor > 50) && (valor <= 75)) {
			System.out.println("Intervalo 3");
		}else if((valor > 75) && (valor <= 100)) {
			System.out.println("Intervalo 4");
		}else {
			System.out.println("valor acima dos intervalos");
		}
		
		sc.close();
	}

}
