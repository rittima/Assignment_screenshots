package Intermediate_OOP;

 class BankAccount {
     int balance = 10000;
}

 class CurrentAccount extends BankAccount {
     void deposite(int amount) {

        this.balance -= amount;
        System.out.println("cash:" + this.balance);
    }
}

class SavingAccount extends BankAccount{
     void deposite(int amount) {

        this.balance += amount;
        System.out.println("cash:" + this.balance);
        ;
    }
}
