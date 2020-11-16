

import java.util.Scanner;

public class SaqueDinheiro extends ContaCorrente {


    public void ValorSaque() {

        double valorSaque = 10 - 20 - 50 - 100;


        System.out.println("Seu saldo é "+ saldo);

            System.out.println("Digite o valor que deseja sacar: 10, 20, 50, 100: ");
            Scanner scanner = new Scanner(System.in);
            Integer valor = scanner.nextInt();

            if (saldo >= valorSaque) {
                System.out.println("Saque Autorizado ");
            } else if (saldo != valorSaque){
                System.out.println("Escolha outro valor");
            }else {
                System.out.println("Saldo Insulficiente ");
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






