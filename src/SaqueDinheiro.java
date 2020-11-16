
import java.util.*;

public class SaqueDinheiro extends ContaCorrente {

    public void ValorSaque() {

        List<Double> valoresPermitidos = new ArrayList<>();
        valoresPermitidos.add(10.0);
        valoresPermitidos.add(20.0);
        valoresPermitidos.add(50.0);
        valoresPermitidos.add(100.0);

        System.out.println("Seu saldo é "+ saldo);

        System.out.println("Informe valor de Saque: 10, 20, 50, 100: ");
        Scanner scanner = new Scanner(System.in);
        Double valor = scanner.nextDouble();

        double valorSacado = saldo -= valor;

        if (saldo >= valor) {
            if (valoresPermitidos.contains(valor)) {
                System.out.println("Saque autorizado");
                System.out.println("Seu novo Saldo R$ " + valorSacado);
            } else {
                System.out.println("Valor não disponível");
            }
        }else {
            System.out.println("Saldo insulficiente");
        }
    }

    public SaqueDinheiro(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo, chequeEspecial);
    }

    @Override
    public String toString() {
        return "SaqueDinheiro{" +
                "saldo=" + saldo +
                '}';
    }

    public double getSaldo(){
        return this.saldo;
    }
}
