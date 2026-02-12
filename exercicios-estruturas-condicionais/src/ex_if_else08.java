import java.util.Locale;
import java.util.Scanner;

public class ex_if_else08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto = 0;
		
		System.out.println("Digite o salário do funcionário com até duas casas decimais para calulcar imposto");
		salario = sc.nextDouble();
		
		if(salario > 4500.00) {
			imposto += (salario - 4500.00)* 0.28;
			salario = 4500.00;
		}if(salario > 3000.00) {
			imposto += (salario - 3000.00) * 0.18;
			salario = 3000.00;
		}if(salario > 2000.00) {
			imposto += (salario - 2000.00) * 0.08;
			salario = 2000.00;
		}if(salario < 2000) {
			System.out.println("isento");
		}else {
			System.out.printf("O valor cobrado é de RS %.2f%n", imposto);
		}
		sc.close();
	}

}
