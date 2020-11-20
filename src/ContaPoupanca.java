import java.util.Scanner;

public class ContaPoupanca extends Conta {


    private int diaAniversario;
    private double taxaDeJuros;
    private double saldoContaPoupanca;


    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
        this.saldo = saldo;
    }

    @Override
    public double getSaldo() {
        return this.saldoContaPoupanca + this.taxaDeJuros * this.saldoContaPoupanca;
    }

    @Override
    public void setSaldo(double saldo) {

    }

    public boolean ValorDepositoPoupanca() {

        System.out.println("Informe o valor de investimento R$ ");

        Scanner scanner = new Scanner(System.in);
        double valorDeposito = scanner.nextDouble();

        double valorDep = saldoContaPoupanca += valorDeposito;

        if (getSaldo() >= valorDeposito) {
            System.out.println("Seu novo Saldo R$  " + valorDep);
            System.out.println("Saldo mais taxa R$ " + this.saldoContaPoupanca * this.taxaDeJuros);
            System.out.println("Transação realizada com sucesso \n " +
                    "Deseja fazer nova operaçao? Escolha 1 para (Sim) ou aperte 2) para sair: ");
            saldoContaPoupanca = valorDep;
            return true;
        }else{
            System.out.println("Saldo insulficiente ");
            return false;
        }
    }
}

