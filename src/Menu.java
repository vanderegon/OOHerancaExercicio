import java.util.Scanner;

public class Menu extends MenuPrincipal {


    private int escolha;
    private Scanner scanner;
    private ContaCorrente contaCorrente;
    private ContaSalario contaSalario;
    private SaqueDinheiro saqueDinheiro;
    private Deposito deposito;
    private ContaPoupanca contaPoupanca;

    public Menu(Scanner scanner, ContaCorrente cc1,
                ContaSalario cS, SaqueDinheiro sQ,
                Deposito dP, ContaPoupanca p1) {
        super();
        this.scanner = scanner;
        this.contaCorrente = cc1;
        this.contaSalario = cS;
        this.saqueDinheiro = sQ;
        this.deposito = dP;
        this.contaPoupanca = p1;
    }

    public void Menu() {

      boolean continua = true;
      boolean repetirTransacao = false;
      String valorDecisao = "";

        while (continua) {


            if (!repetirTransacao){
                valorDecisao = scanner.next();
            }
            switch (valorDecisao) {

                case "1": {
                    System.out.println("Você escolheu sacar: ");

                    saqueDinheiro.setSaldo(contaCorrente.getSaldo());

                    boolean resultadoSaque = saqueDinheiro.ValorSaque();


                    contaCorrente.setSaldo(saqueDinheiro.getSaldo());

                    if (!resultadoSaque) {
                        continua = false;
                        break;
                    }
                    break;
                }


                case "2": {

                    System.out.println("Voce escolheu depósitar: ");
                    deposito.ValorDeposito();
                    contaCorrente.setSaldo(deposito.getSaldo() + contaCorrente.getSaldo());

                    break;
                }
                case "3": {
                    System.out.println("Você deseja investir na poupança? \n informe o valor para investimento: ");

                    contaPoupanca.ValorDepositoPoupanca();
                    break;
                }



                case "4": {
                System.out.println("Saque conta salario");

                boolean resultado = contaSalario.limiteSaqueSalario();
                if (!resultado) {
                    break;
                }
                    break;
            }

                case "0":
                    System.exit(0);


                default :
                    continua = false;
                    System.out.println("Opção inválida!");


        }
            escolha = scanner.nextInt();

            if (escolha == 2) {
                break;
            }
            if (escolha == 1){
                repetirTransacao = true;
            }
        }
    }
}



