import java.util.Scanner;

public class Sistema_de_aprovacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nome;
		double nota1, nota2, media;
		
		System.out.println("Nome do aluno: ");
		nome = sc.nextLine();
		System.out.println("Primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("segunda nota: ");
		nota2 = sc.nextDouble();
		if(nota1 <0 || nota1 >10 || nota2 <0 || nota2 >10) {
			System.out.println("Nota inválida");
		}else {media = (nota1 + nota2) / 2;
		
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
		}
		
		sc.close();
	}

}
