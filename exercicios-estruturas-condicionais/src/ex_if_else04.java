import java.util.Scanner;

public class ex_if_else04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hora1, hora2, resultado;
		
		System.out.println("Digite hora inicial e hora final do jogo para saber a duração(mínimo de 1 hora e máximo de 24 horas)");
		System.out.println("Hora de início: ");
		hora1 = sc.nextInt();
		System.out.println("Hora de término");
		hora2 = sc.nextInt();
		if(hora1 > hora2) {
			resultado = (24 - hora1) + hora2;
			System.out.println("O jogo durou "+ resultado +" hora(s)");
		}else if (hora1 < hora2) {
			resultado = hora2 - hora1;
			System.out.println("O jogo durou "+ resultado +" hora(s)");
		}else if(hora1 == hora2) {
			System.out.println("O jogo durou 24 hora(s)");
		}
		sc.close();
	}

}
