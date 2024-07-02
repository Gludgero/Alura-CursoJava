import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Guilherme Ludgero";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int n = 0;

        // Mensagem inicial - \n
        System.out.println("*******************************\nDados iniciais do cliente:\n\n");
        System.out.println("Nome: " + nome);
        System.out.println("\nTipo de conta: " + tipoConta);
        System.out.println("\nSaldo inicial: " + saldo);
        System.out.println("*******************************\n");

        // Menu de opções -

        while(n != 4) {

            System.out.println("Por favor, escolha uma das seguintes operações:");
            System.out.println("\n1- Consultar saldos\n2- Receber Valores\n3- Trasferir valor\n4- Sair");

            n = scanner.nextInt();

        if (n == 1) {
            System.out.println("O saldo atual é de: " + saldo);

        } else if (n == 2) {
            System.out.println("Informe o valor a receber: ");
            saldo = saldo + scanner.nextDouble();
            System.out.println("O novo saldo é de: " + saldo);

        } else if ( n == 3) {
            System.out.println("Informe o valor a ser transferido: ");
            double transf = scanner.nextDouble();

            if (saldo >= transf) {
                saldo = saldo - transf;
                System.out.println("O novo saldo é de: " + saldo);
            } else {
                System.out.println("Por favor, digite um valor válido!");
            }
        } else if (n != 4){
            System.out.println("Número inválido! Digite um caractere válido");
        }

        }















//______________________________________________________________________________________________
        }
    }