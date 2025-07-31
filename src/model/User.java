package model;

import java.math.BigDecimal;
import java.util.UUID;

public class User {
    private UUID id;
    private String cpf;
    private String name;
    private BigDecimal balance;
    private String number;
    private String password;

    public User() {}

    public User(String cpf, String name, String number, String password) {
        this.id = UUID.randomUUID();
        this.cpf = cpf;
        this.name = name;
        this.balance = BigDecimal.ZERO;
        this.number = number;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void deposit(BigDecimal value) {
        if(value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor inválido.");
        }
        setBalance(getBalance().add(value));
    }

    public void withdraw(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor inváido.");
        }
        if (value.compareTo(getBalance()) > 0) {
            throw new IllegalArgumentException("saldo insuficiente.");
        }
        setBalance(getBalance().subtract(value));
    }
}