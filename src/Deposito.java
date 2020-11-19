import java.util.Scanner;

public class Deposito extends ContaCorrente {

    public void ValorDeposito(){

        System.out.println("Informe o valor de depósito: ");

        Scanner scanner = new Scanner(System.in);
        Double valorDeposito = scanner.nextDouble();

        double valorDep = saldo += valorDeposito;

        if(saldo >= valorDeposito){
            System.out.println("Seu novo Saldo R$ "+ valorDep);
        }

    }

    public Deposito( int numero, int agencia, String banco,double saldo, double chequeEspecial){
        super(numero, agencia, banco, saldo, chequeEspecial);
    }

    @Override
    public String toString () {
        return "Deposito{" +
                "saldo=" + saldo +
                '}';
    }
    public double getSaldo(){
        return this.saldo;
    }

}