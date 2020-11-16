import java.util.Scanner;

public class ContaPoupanca extends Conta {


    private int diaAniversario;
    private double taxaDeJuros;


    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double tacaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = tacaDeJuros;
    }

    public double getSaldo() {
        return this.saldo + this.taxaDeJuros * this.saldo;
    }

    public void ValorDepositoPoupanca() {

        System.out.println("Informe o valor de investimento R$ ");

        Scanner scanner = new Scanner(System.in);
        Double valorDeposito = scanner.nextDouble();

        double valorDep = saldo += valorDeposito;

        if (saldo >= valorDeposito) {
            System.out.println("Seu novo Saldo R$  " + valorDep);
            System.out.println("Saldo mais taxa R$ " + this.saldo * this.taxaDeJuros);
        }
    }
}

