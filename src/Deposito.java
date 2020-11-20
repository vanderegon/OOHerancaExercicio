import java.util.Scanner;

public class Deposito extends ContaCorrente {

    public void ValorDeposito(){

        System.out.println("Informe o valor de depósito: ");

        Scanner scanner = new Scanner(System.in);
        Double valorDeposito = scanner.nextDouble();

        double valorDep = this.saldoContaCorrente += valorDeposito;

            System.out.println("Seu novo Saldo R$ "+ valorDep);
            System.out.println("Transação realizada com sucesso \n Deseja fazer nova operaçao? " +
                    "Escolha 1 para (Sim) ou aperte qualquer botão numérico para sair\"); ");
            saldoContaCorrente = valorDep;


    }

    public Deposito( int numero, int agencia, String banco,double saldo, double chequeEspecial){
        super(numero, agencia, banco, saldo, chequeEspecial);
    }

    @Override
    public String toString () {
        return "Deposito{" +
                "saldo=" + this.saldoContaCorrente +
                '}';
    }
    public double getSaldo(){
        return this.saldoContaCorrente;
    }

}