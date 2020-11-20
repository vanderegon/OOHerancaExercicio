import java.util.Scanner;

public class Deposito extends ContaCorrente {



    public Deposito( int numero, int agencia, String banco,double saldo, double chequeEspecial){
        super(numero, agencia, banco, saldo, chequeEspecial);
    }

    @Override
    public String toString () {
        return "Deposito{" +
                "saldo=" + this.saldo +
                '}';
    }

    public double getSaldo(){
        return this.saldo;
    }

}