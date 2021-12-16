package ru.job4j.bank;

import java.util.Objects;

public class Account {
    private String reguisite;
    private double balance;

    public Account(String reguisite, double balance) {
        this.reguisite = reguisite;
        this.balance = balance;
    }

    public void setReguisite(String reguisite) {
        this.reguisite = reguisite;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getReguisite() {
        return reguisite;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0
                && Objects.equals(reguisite, account.reguisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reguisite, balance);
    }
}
