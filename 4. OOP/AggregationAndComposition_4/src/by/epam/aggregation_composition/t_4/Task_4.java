package by.epam.aggregation_composition.t_4;

import java.util.Arrays;

// Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, 
// имеющим положительный и отрицательный балансы отдельно.

public class Task_4 {
	public static void main(String[] args) {
		Client client1 = new Client("Alexander Vladimirovich", "Minsk", "+375257777777");

		Account client1Acc1 = new Account("118", -3600);
		Account client1Acc2 = new Account("117", -19139);
		Account client1Acc3 = new Account("116", -400280);
		Account client1Acc4 = new Account("115", 1000000);
		Account client1Acc5 = new Account("114", -16800);
		Account client1Acc6 = new Account("113", 1000);
		Account client1Acc7 = new Account("112", 130);

		client1.addAccount(client1Acc1);
		client1.addAccount(client1Acc2);
		client1.addAccount(client1Acc3);
		client1.addAccount(client1Acc4);
		client1.addAccount(client1Acc5);
		client1.addAccount(client1Acc6);
		client1.addAccount(client1Acc7);

		client1.printAccountsList();

		System.out.println("Общий баланс: " + client1.accountsBalance());

		System.out.println("Общий положительный счет: " + client1.positiveAccountsBalance());
		System.out.println("Общий отрицательный счет: " + client1.negativeAccountsBalance());

		client1.blockAccount("115");
		client1.blockAccount("116");

		System.out.println("Общий положительный счет: " + client1.positiveAccountsBalance());
		System.out.println("Общий отрицательный счет: " + client1.negativeAccountsBalance());

		Arrays.sort(client1.getAccounts(), new Account.SortByNumbers());

		client1.printAccountsList();
	}
}
