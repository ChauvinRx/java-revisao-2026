import java.util.Scanner;

public class ex_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome;
		double nota1, nota2;
		int cadastro = 1;
		while(true){
		System.out.println("Cadastro:\n"
				+ "Nome: ");
		nome = sc.nextLine();
		System.out.println("primeira nota: ");
		nota1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("segunda nota: ");
		nota2 = sc.nextDouble();
		sc.nextLine();
		if(nota1 <0 || nota1 >10 || nota2 <0 || nota2 >10) {
			System.out.println("Nota inválida");
			continue;
		}else {double media = (nota1 + nota2) / 2;
		
		if(media < 5) {
			System.out.println(" nome: " + nome +
					"\n média: " + media + "\n situação: reprovado");
		}else if(media >= 5 && media < 7) {
			System.out.println(" nome: " + nome +
					"\n média: " + media + "\n situação: recuperação");
		}else{
			System.out.println(" nome: " + nome +
					"\n média: " + media + "\n situação: aprovado");
		}
		System.out.println("Deseja cadastrar um novo aluno?\n" +
		"1 - sim\n" + "2 - não");
		cadastro = sc.nextInt();
		sc.nextLine();
		if(cadastro == 2) {
			break;
		}
		}
		}
		
		
		sc.close();
	}

}
