import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
			
		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia, nome_cliente;j
		double saldo;
		
		System.out.println("Por favor, digite o número da Conta !");
		numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Por favor, digite o número da Agência !");
		agencia = sc.nextLine();
		System.out.println("Por favor, digite o Nome do Cliente !");
		nome_cliente = sc.nextLine();
		System.out.println("Por favor, digite o Saldo!");
		saldo = sc.nextDouble();
		
		sc.close();
		
		System.out.println("Olá " + nome_cliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque");
	}

}
