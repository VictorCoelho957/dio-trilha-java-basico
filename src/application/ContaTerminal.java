package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosConta;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
			 DadosConta db;
			 db=new DadosConta ();
			 
			 
			System.out.println("Por favor, informe seu nome: ");
			db.NomeCliente= sc.nextLine();
			System.out.println("Por favor, informe o número da sua conta: ");
			db.Numero= sc.nextInt();
			System.out.println("Por favor, informe o número da sua agencia: ");
			sc.nextLine();
			db.Agencia= sc.nextLine();
			System.out.println("Por favor, informe SEU SALDO: ");
			db.Saldo= sc.nextDouble();
			
			System.out.println("Olá "+ ", " + db.getNomeCliente() +"!"+ " Obrigado por abrir uma conta em nosso banco.  Seus dado são os seguintes: " + "\nNumero da conta: " + db.getNumero() 
			+ "\nAgencia: " + db.getAgencia() + "\nSaldo: " + db.getSaldo());
			
			
			
			
			


		
		sc.close();

	}

}
