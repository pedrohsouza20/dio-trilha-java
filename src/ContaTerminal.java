import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer accountNumber = null;
		String accountAgency = null;
		String clientName = null;
		Float balance = null;
		
		System.out.println("Por favor, digite o número da conta:");
		accountNumber = scanner.nextInt();
		
		System.out.println("Agência: ");
		accountAgency = scanner.next();
		
		System.out.println("Nome do cliente: ");
		clientName = scanner.next();
		
		System.out.println("Saldo: ");
		balance = scanner.nextFloat();
		
		System.out.println("Olá ".concat(clientName).concat(", obrigado por criar uma conta em nosso banco, sua agência é:".concat(accountAgency).concat(", conta: ") + accountNumber).concat(" e seu saldo de ") + balance + " já está disponível para saque.");
		
	}
	
}
