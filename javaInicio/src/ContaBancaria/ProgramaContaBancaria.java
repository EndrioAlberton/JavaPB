package ContaBancaria;

import java.util.Scanner;

class ContaBancaria {
    private int numeroDaConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroDaConta, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
    }

    public ContaBancaria(int numeroDaConta, String titular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        depositar(depositoInicial);
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String novoNome) {
        this.titular = novoNome;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor + 5.0) {
            saldo -= valor + 5.0;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}

public class ProgramaContaBancaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroDaConta = sc.nextInt();

        sc.nextLine();
        System.out.print("Digite o titular da conta: ");
        String titular = sc.nextLine();

        System.out.print("Haverá depósito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

        ContaBancaria conta;
        if (resposta == 's') {
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new ContaBancaria(numeroDaConta, titular, depositoInicial);
        } else {
            conta = new ContaBancaria(numeroDaConta, titular);
        }

        System.out.println("Dados da conta:");
        System.out.println(conta.getNumeroDaConta() + ", Titular: " + conta.getTitular() +
                ", Saldo: R$ " + String.format("%.2f", conta.getSaldo()));

        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);

        System.out.println("Dados da conta atualizados:");
        System.out.println(conta.getNumeroDaConta() + ", Titular: " + conta.getTitular() +
                ", Saldo: R$ " + String.format("%.2f", conta.getSaldo()));

        System.out.print("Digite o valor do saque: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);

        System.out.println("Dados da conta atualizados:");
        System.out.println(conta.getNumeroDaConta() + ", Titular: " + conta.getTitular() +
                ", Saldo: R$ " + String.format("%.2f", conta.getSaldo()));

        sc.close();
    }
}

