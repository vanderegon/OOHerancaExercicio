import java.util.Scanner;

public class ContaCorrente extends Conta {

    private Scanner scanner;
    public double saldoContaCorrente;

    private final double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
        this.saldoContaCorrente = saldo;
        setSaldo(saldo);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }

    @Override
    public double getSaldo(){
        return  this.chequeEspecial + this.saldoContaCorrente;
    }


}

