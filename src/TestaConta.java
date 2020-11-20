import java.util.Scanner;

public class TestaConta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaCorrente cc1 = new ContaCorrente (22,1,"banco CC", 100.00, 1000.00);
        System.out.println(cc1);

        System.out.println("O saldo da Conta corrente é R$"+ cc1.getSaldo());

        ContaPoupanca p1 = new ContaPoupanca(33,3,"banco CCC,",10,20,0.05);
        System.out.println("O saldo da Conta Poupança é R$"+ p1.getSaldo());


        ContaSalario cS = new ContaSalario(22,1,"Banco CC",100.00,1000.00);
        System.out.println("Saldo Conta Salario"+ cS);

        //SaqueDinheiro sQ = new SaqueDinheiro(1,1,"Banco CC",100.00,1000.00);
        //sQ.ValorSaque();

        //Deposito dP = new Deposito(1,1,"Banco CC",100.00,1000.00);
        //dP.ValorDeposito();

        MenuPrincipal menuPrincipal = new MenuPrincipal();

        Menu menu = new Menu(scanner, cc1,cS, p1);

        do {
            menuPrincipal.imprimeMenu();
            menu.Menu();
        } while (true);

    }

}
