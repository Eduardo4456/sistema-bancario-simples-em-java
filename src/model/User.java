package model;

import java.math.BigDecimal;

public class User {
    private Long id;
    private String name;
    private BigDecimal saldo;
    private String number;
    private char[] password;

    public User() {}

    public User(Long id, String name, BigDecimal saldo, String number, char[] password) {
        this.id = id;
        this.name = name;
        this.saldo = BigDecimal.ZERO;
        this.number = number;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
}