import java.util.Scanner;

public class Menu extends MenuPrincipal {

    public void Menu() {

        Menu menu = new Menu();

        boolean continua = true;

        while (true) {
            menu.imprimeMenu();
            String valorDecisao = menu.decisaoUsuario();

            switch (valorDecisao) {
                case "1" -> {
                    System.out.println("Você escolheu sacar: ");
                    SaqueDinheiro sQ = new SaqueDinheiro(1, 1, "Banco CC", 100.00, 1000.00);
                    sQ.ValorSaque();
                    System.out.println("Transação realizada com sucesso \n Deseja realizar novo saque? " +
                            "\n Escolha 1 para (Sim) ou aperte qualquer botão numérico para sair");
                    Scanner opcao1 = new Scanner(System.in);
                    int escolha = opcao1.nextInt();
                    if (escolha == 1) {
                        sQ.ValorSaque();
                    } else {
                        menu.imprimeMenu();
                    }
                }
                case "2" -> {
                    System.out.println("Voce escolheu depósitar: ");
                    Deposito dP = new Deposito(1, 1, "Banco CC", 100.00, 1000.00);
                    dP.ValorDeposito();
                    System.out.println("Transação realizada com sucesso \n Deseja fazer nova operaçao? " +
                            "Escolha 1 para (Sim) ou aperte qualquer botão numérico para sair\"); ");
                    Scanner opcaoDep = new Scanner(System.in);
                    Integer escolhaDep = opcaoDep.nextInt();
                    if (escolhaDep == 1) {
                        dP.ValorDeposito();
                    } else {
                        menu.imprimeMenu();
                    }
                }
                case "3" -> {
                    System.out.println("Você deseja investir na poupança? \n informe o valor para investimento: ");
                    ContaPoupanca p1 = new ContaPoupanca(33, 3, "banco CCC,", 10, 20, 0.05);
                    p1.ValorDepositoPoupanca();
                    System.out.println("Transação realizada com sucesso \n " +
                            "Deseja fazer nova operaçao? Escolha 1 para (Sim) ou aperte qualquer botão numérico para sair: ");
                    Scanner opcaoInves = new Scanner(System.in);
                    Integer escolhaInves = opcaoInves.nextInt();
                    if (escolhaInves == 1) {
                        p1.ValorDepositoPoupanca();
                    } else {
                        menu.imprimeMenu();
                    }
                }
                case "4" -> {
                    System.out.println("Saque conta salario");
                    ContaSalario cS = new ContaSalario(22, 1, "Banco CC", 100.00, 1000.00);
                    cS.limiteSaqueSalario();
                    System.out.println("Transação realizada com sucesso \n+" +
                            "Deseja fazer nova operaçao? Escolha 1 para (Sim) ou aperte qualquer botão numérico para sair:");
                    Scanner opcaoSaque = new Scanner(System.in);
                    Integer escolhaSaque = opcaoSaque.nextInt();
                    if (escolhaSaque == 1) {
                        cS.limiteSaqueSalario();
                    } else {
                        menu.imprimeMenu();
                    }
                }
                case "0" -> System.exit(0);
                default -> {
                    System.out.println("Opção inválida!");
                }
            }

        }


    }

    public Menu() {
    }

}