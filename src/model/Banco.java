package model;

import java.math.BigDecimal;
import java.util.List;

public class Banco {
    private User user;
    private String branch;

    public Banco() {}

    public Banco(User user, String branch) {
        this.user = user;
        this.branch = branch;
    }

    public void sacar(BigDecimal value) {
        user.setSaldo(user.getSaldo().subtract(value));
        System.out.println("O saque de " + value + " R$ foi executado.");
    }

    public void depositar(BigDecimal value) {
        user.setSaldo(user.getSaldo().add(value));
        System.out.println("O deposito de " + value + " R$ foi executado.");
    }

    public void verSaldo() {
        System.out.println("Seu saldo é de " + user.getSaldo());
    }

    public User getUser() {
        return user;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
