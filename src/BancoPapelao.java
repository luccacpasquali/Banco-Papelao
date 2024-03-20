import java.util.Scanner;

public class BancoPapelao {
    public static void main(String[] args) {


        String nomeCliente = "Lucca Pasquali";
        String tipoConta = "Corrente";
        float saldo = 1200;
        int resposta = 0;
        String menu = """
                    Opeações 
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """;

        Scanner leitor = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("Dados do Cliente: \n");
        System.out.println("Nome           "+nomeCliente);
        System.out.println("Tipo da Conta: "+tipoConta);
        System.out.println("Saldo        : R$"+saldo);
        System.out.println("****************************");

        while (resposta != 4){
            System.out.println(menu);
            resposta = leitor.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println("Saldo atual: "+saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor que ira receber: ");
                    saldo += leitor.nextFloat();
                    System.out.println("Operação realizada com sucesso");
                    System.out.println("Saldo atual: "+saldo);
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");
                    float transferencia = leitor.nextFloat();

                    if (transferencia <= saldo){
                        saldo -= transferencia;
                        System.out.println("Transferencia realizada com sucesso");
                    }else {
                        System.out.println("Operação inválida, o valor que deseja tranferir é maior que o saldo");
                    }
                    System.out.println("Saldo atual: "+saldo);
                    break;

                case 4:
                    System.out.println("\nAté logo...");
                    break;

                default:
                    System.out.println("\nOPÇÃO INVÁLIDA");
                    break;
            }
        }

    }
}


