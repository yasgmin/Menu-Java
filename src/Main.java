import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nomeCliente = "Yasmin";
        String tipoConta = "Corrente";
        float saldoInicial = 3000;
        float saldo = saldoInicial;

        System.out.println("------------------------------");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldoInicial);
        System.out.println("------------------------------");
        System.out.println("Selecione a opção desejada:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Receber valor");
        System.out.println("3. Transferir valor");
        System.out.println("4. Sair");

        int opcao = leitura.nextInt();

        if (opcao == 1) {
            System.out.println("O seu saldo é de: " + saldo);
        } else if (opcao == 2) {
            System.out.println("Qual valor você deseja receber?");
            float numeroRecebido = leitura.nextFloat();
            float saldoFinal1 = saldo + numeroRecebido;
            System.out.println("Você recebeu o valor de R$ " + numeroRecebido + ". Seu saldo atual é de: " + saldoFinal1);
            saldo = saldoFinal1;
        } else if (opcao == 3) {
            System.out.println("Qual valor você deseja transferir?");
            float numeroTransferido = leitura.nextFloat();
            if (numeroTransferido <= saldo) {
                float saldoFinal2 = saldo - numeroTransferido;
                System.out.println("Você transferiu o valor de R$ " + numeroTransferido + ". Seu saldo atual é de: " + saldoFinal2);
                saldo = saldoFinal2;
            } else {
                System.out.println("Saldo insuficiente para a transferência.");
            }
        } else if (opcao == 4) {
            System.out.println("Finalizando por aqui, volte sempre!");
        } else {
            System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
        }
    }
}