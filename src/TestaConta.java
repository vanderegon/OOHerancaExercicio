import java.util.Scanner;

public class TestaConta {

    public static void main(String[] args) {

        //Conta conta = new Conta(1, 1, "AA", 100.00);

        ContaCorrente cc1 = new ContaCorrente (22,1,"banco CC", 100.00, 1000.00);
        System.out.println(cc1);

        System.out.println("O saldo da Conta corrente é R$"+ cc1.getSaldo());

        ContaPoupanca p1 =new ContaPoupanca(33,3,"banco CCC,",10,20,0.05);
        System.out.println("O saldo da Conta Poupança é R$"+ p1.getSaldo());


        ContaSalario cS = new ContaSalario(22,1,"Banco CC",100.00,1000.00);
        System.out.println("Saldo Conta Salario"+ cS);


        SaqueDinheiro sQ = new SaqueDinheiro(1,1,"Banco CC",100.00,1000.00);
        //sQ.ValorSaque();

        Deposito dP = new Deposito(1,1,"Banco CC",100.00,1000.00);
        //dP.ValorDeposito();

        p1.setSaldo(100);

        MenuPrincipal menu1 = new MenuPrincipal();
        Scanner scanner = new Scanner(System.in);



        Menu menu = new Menu(scanner, cc1,cS,sQ,dP,p1);
        while (true){
            menu1.imprimeMenu();
            menu.Menu();
        }

    }

}
