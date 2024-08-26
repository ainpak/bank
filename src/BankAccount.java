public class BankAccount {

        private String accountNumber;
        private double balance;
        private double interestRate;

        // Статическое поле для отслеживания общего количества созданных счетов
        private static int totalAccounts = 0;

        // Конструктор класса BankAccount
        public BankAccount(String accountNumber, double balance, double interestRate) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.interestRate = interestRate;
            totalAccounts++; // Увеличиваем счетчик при создании нового счета
        }

        // Геттеры и сеттеры для полей accountNumber, balance и interestRate
        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        // Статический метод для получения общего количества созданных счетов
        public static int getTotalAccounts() {
            return totalAccounts;
        }
    }


