import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaSalario extends Conta {

    private Scanner scanner;
    private final double SALARIO;
    private double saldoContaSalario;


    public ContaSalario(int numero, int agencia, String banco, double saldo, double salario) {
        super(numero, agencia, banco, saldo);
        this.SALARIO = salario;
        this.saldoContaSalario = saldo;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "salario=" + SALARIO +
                '}';
    }

    public double getSaldo() {
        return this.saldoContaSalario + this.SALARIO;
    }

    public boolean limiteSaqueSalario() {

        List<Double> valoresPermitidos = new ArrayList<>();
        valoresPermitidos.add(10.0);
        valoresPermitidos.add(20.0);
        valoresPermitidos.add(50.0);
        valoresPermitidos.add(100.0);

        System.out.println("Seu saldo é " + saldoContaSalario);


        System.out.println("Informe valor de Saque: 10, 20, 50, 100: ");
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();

        double valorSacado = saldoContaSalario -= valor;
        int limiteSaque = 3;

        if (saldoContaSalario >= valor) {
            if (valoresPermitidos.contains(valor)) {
                if (limiteSaque < 4) {
                    System.out.println("Saque autorizado");
                    System.out.println("Seu novo Saldo R$ " + valorSacado);
                    System.out.println("Restam apenas " + --limiteSaque + " saques! ");
                    System.out.println("Transação realizada com sucesso \n+" +
                            "Deseja fazer nova operaçao? Escolha 1 para (Sim) ou aperte qualquer botão numérico para sair:");
                    saldoContaSalario = valorSacado;
                    return true;
                } else {
                    System.out.println("Voce atingiu a quantidade limete de saques 3");
                    return false;
                }

            } else {
                System.out.println("Valor não disponível");
                return false;
            }
        } else {
            System.out.println("Saldo insulficiente");
            return false;
        }


    }
}
