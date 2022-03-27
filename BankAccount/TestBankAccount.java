class TestBankAccount {
    public static void main(String[] args) {

        BankAccount personOne = new BankAccount();
        personOne.depositMoney(100, "checking");
        personOne.depositMoney(200, "savings");
        personOne.withdrawMoney(50, "checking");
        personOne.withdrawMoney(100, "savings");

        BankAccount personTwo = new BankAccount();
        personTwo.depositMoney(50, "checking");
        personTwo.depositMoney(25, "savings");
        personTwo.withdrawMoney(10, "checking");
        personTwo.withdrawMoney(200, "savings");

        System.out.println(personOne.getCheckingBalance());
        System.out.println(personOne.getSavingsBalance());

        System.out.println(personTwo.getCheckingBalance());
        System.out.println(personTwo.getSavingsBalance());

        System.out.println(BankAccount.totalHoldings);
    }
}