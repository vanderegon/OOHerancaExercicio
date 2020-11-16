public class ContaSalario extends Conta {

    private double salario;

    public ContaSalario(int numero, int agencia, String banco, double saldo, double salario) {
        super(numero, agencia, banco, saldo);
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "ContaSalario{" +
                "salario=" + salario +
                '}';
    }

    public double getSaldo(){
        return this.saldo + this.salario;
    }
}



