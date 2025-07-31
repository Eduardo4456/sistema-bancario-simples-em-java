package service;

import model.User;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BancoService {
    private final Map<String, User> users = new HashMap<>();

    public void registerUsers(String cpf, String name, String number, String password) {
        if (users.containsKey(cpf)) {
            throw new IllegalArgumentException("Usuario já existe.");
        }
        users.put(cpf, new User(cpf, name, number, password));
    }

    public void deposit(String cpf, BigDecimal value) {
        User user = getUser(cpf);
        user.deposit(value);
        System.out.println("Deposito efetuado com sucesso.");
    }

    public void withdraw(String cpf, BigDecimal value) {
        User user = getUser(cpf);
        user.withdraw(value);
        System.out.println("Saque efetuado com sucesso.");
    }

    public void checkBalance(String cpf) {
        System.out.print(getUser(cpf).getBalance());
    }

    private User getUser(String cpf) {
        User user = users.get(cpf);
        if (user == null) throw new IllegalArgumentException("Usuário não encontrado.");
        return user;
    }
}
