
import java.util.*;

public class SaqueDinheiro extends ContaCorrente {

    private Scanner scanner;

    public boolean ValorSaque() {

        List<Double> valoresPermitidos = new ArrayList<>();
        valoresPermitidos.add(10.0);
        valoresPermitidos.add(20.0);
        valoresPermitidos.add(50.0);
        valoresPermitidos.add(100.0);

        System.out.println("Seu saldo é "+ this.saldoContaCorrente);

        System.out.println("Informe valor de Saque: 10, 20, 50, 100: ");
        Scanner scanner = new Scanner(System.in);
        Double valor = scanner.nextDouble();

        double valorSacado = this.saldoContaCorrente - valor;

        if (this.saldoContaCorrente >= valor) {
            if (valoresPermitidos.contains(valor)) {
                System.out.println("Saque autorizado");
                System.out.println("Seu novo Saldo R$ " + valorSacado);
                System.out.println("Transação realizada com sucesso \n Deseja realizar novo saque? " +
                        "\n Escolha 1 para (Sim) ou aperte 2 para voltar ao menu principal");
                this.saldoContaCorrente =  valorSacado;
                setSaldo(valorSacado);
                return true;
            } else {
                System.out.println("Valor não disponível");
                return false;
            }
        }else {
            System.out.println("Saldo insulficiente");
            return false;
        }
    }

    public SaqueDinheiro(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo, chequeEspecial);

    }

    @Override
    public String toString() {
        return "SaqueDinheiro{" +
                "saldo=" + this.saldoContaCorrente +
                '}';
    }

    public double getSaldo(){
        return this.saldoContaCorrente;
    }
}
