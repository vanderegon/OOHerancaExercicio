import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public void limiteSaqueSalario() {

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

        int limiteSaque = 3;

            for (int i = 0; i < limiteSaque; i++) {
                if (limiteSaque < 4)
                    System.out.println ("Restam apenas " + --limiteSaque + " saques! ");
                else {
                    System.out.println("Voce atingiu a quantidade limete de saques 3");
                }
        }
    }
}




