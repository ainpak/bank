public class Main {
    public static void main(String[] args) {
        // Создаем несколько банковских счетов
        BankAccount account1 = new BankAccount("123456789", 1000.00, 1.5);
        BankAccount account2 = new BankAccount("987654321", 2000.00, 2.0);

        // Выводим общую информацию
        System.out.println("Account 1: Number = " + account1.getAccountNumber() + ", Balance = " + account1.getBalance() + ", Interest Rate = " + account1.getInterestRate());
        System.out.println("Account 2: Number = " + account2.getAccountNumber() + ", Balance = " + account2.getBalance() + ", Interest Rate = " + account2.getInterestRate());

        // Выводим количество созданных банковских счетов
        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
    }
}