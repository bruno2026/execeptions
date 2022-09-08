import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o numero da conta");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.print("Digite seu nome");
		String holder = sc.nextLine();

		System.out.print("Digite o saldo inicial");
		Double balance = sc.nextDouble();
		sc.nextLine();

		System.out.print("Limite de saque");
		Double withdrawLimit = sc.nextDouble();
		sc.nextLine();
		Account acc = new Account(number, holder, balance, withdrawLimit);

		System.out.print("Enter amount for withdraw:");
		Double amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.println(acc);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

		

		sc.close();

	}

}
