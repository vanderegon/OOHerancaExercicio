import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaCorrente extends Conta {

    private final double chequeEspecial;
    private final double saldoInicial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
        this.saldo = saldo;
        this.saldoChequeEspecial = chequeEspecial;
        this.saldoInicial = saldo;
        this.saldoContaCorrente = saldoInicial;
    }

    public boolean EfetuarSaque() {

        List<Double> valoresPermitidos = new ArrayList<>();
        valoresPermitidos.add(10.0);
        valoresPermitidos.add(20.0);
        valoresPermitidos.add(50.0);
        valoresPermitidos.add(100.0);

        System.out.println("Saldo da conta "+ saldoContaCorrente);
        System.out.println("Cheque especial "+ saldoChequeEspecial);

        System.out.println("Informe valor de Saque: 10, 20, 50, 100: ");
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();

        double valorSacado = this.saldoContaCorrente - valor;
        double valorSacadoChequeEspecial = this.saldoChequeEspecial - valor;

        if (this.saldoContaCorrente >= valor) {
            if (valoresPermitidos.contains(valor)) {

                this.saldoContaCorrente = valorSacado;

                System.out.println("Saque autorizado");
                System.out.println("Seu novo Saldo R$ " + valorSacado);
                System.out.println("Transação realizada com sucesso \n Deseja realizar novo saque? " +
                        "\n Escolha 1 para (Sim) ou aperte 2 para voltar ao menu principal");

                return true;
            } else {
                System.out.println("Valor não disponível");
                return false;
            }
        }else if(this.saldoChequeEspecial >= valor){
            System.out.println("O saldo da conta é menor que o valor do saque");
            System.out.println("Caso queira efetuar a operação será descontado o valor do cheque especial");
            System.out.println("Confirma essa operação ? ");
            System.out.println("Escolha 1 para (Sim) ou aperte 2 para voltar ao menu principal ");

            int escolha = scanner.nextInt();

            if(escolha == 1){

                this.saldoChequeEspecial = valorSacadoChequeEspecial;
                saldoContaCorrente = saldoContaCorrente - valor;

                System.out.println("Saque cheque especial autorizado");
                System.out.println("Seu novo Saldo R$ " + saldoContaCorrente);
                System.out.println("Seu novo Saldo Cheque especial R$ " + saldoChequeEspecial);
                System.out.println("Transação realizada com sucesso \n Deseja realizar novo saque? " +
                        "\n Escolha 1 para (Sim) ou aperte 2 para voltar ao menu principal");
                return true;
            }else {
                return false;
            }


        }else {
            System.out.println("Saldo insulficiente");
            return false;
        }
    }

    public void EfetuarDeposito(){

        System.out.println("Informe o valor de depósito: ");

        Scanner scanner = new Scanner(System.in);
        double valorDeposito = scanner.nextDouble();

        double valorDep = this.saldoContaCorrente += valorDeposito;

        if(this.saldoContaCorrente < 0){
            double diferenca = this.chequeEspecial - this.saldoChequeEspecial;

            if(diferenca == valorDeposito){
                this.saldoChequeEspecial += valorDeposito;
            }

        }

        System.out.println("Seu novo Saldo R$ "+ valorDep);
        System.out.println("Transação realizada com sucesso \n Deseja fazer nova operaçao? " +
                "Escolha 1 para (Sim) ou aperte qualquer botão numérico para sair\"); ");

        this.saldoContaCorrente = valorDep;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void setSaldo(double saldo) {

    }
}

