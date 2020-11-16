public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double  taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double tacaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = tacaDeJuros;
    }

    public double getSaldo(){
        return this.saldo + this.taxaDeJuros * this.saldo;
    }
}
