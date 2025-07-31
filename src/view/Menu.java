package view;

import service.BancoService;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {
    private final BancoService bancoService = new BancoService();
    private final Scanner scanner = new Scanner(System.in);

    public void show() {
        System.out.print("Digite seu cpf para cadastro/login: ");
        String cpf = scanner.nextLine();

        try {
            System.out.print("nome: ");
            String name = scanner.nextLine();

            System.out.print("numero: ");
            String number = scanner.nextLine();

            System.out.print("password: ");
            String password = scanner.nextLine();

            bancoService.registerUsers(cpf, name, number, password);
            System.out.println("Usuário cadastrado com sucesso");
        } catch (IllegalArgumentException e) {
            System.out.println("Seja bem vindo ");
        }

        int option;
        do {
            System.out.println("\n--- MENU BANCÁRIO ---");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Saldo: R$ ");
                    bancoService.checkBalance(cpf);
                    break;
                case 2:
                    System.out.print("Valor do depósito: ");
                    BigDecimal dep = scanner.nextBigDecimal();
                    bancoService.deposit(cpf, dep);
                    break;
                case 3:
                    System.out.print("Valor do saque: ");
                    BigDecimal wit = scanner.nextBigDecimal();
                    bancoService.withdraw(cpf, wit);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (option != 0);
    }
}
