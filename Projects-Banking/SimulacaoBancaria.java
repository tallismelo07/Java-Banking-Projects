package praticas_02;

import java.util.Scanner;
import java.util.Locale;
public class SimulacaoBancaria {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scannerBanco = new Scanner(System.in);
        double saldo = 0;
        int opcao;


        do {

            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1: Depositar");
            System.out.println("2: Sacar");
            System.out.println("3: Consultar saldo");
            System.out.println("0: Encerrar Programa");
            opcao = scannerBanco.nextInt();


            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor para depositar: ");
                    double depositado = scannerBanco.nextDouble();
                    saldo += depositado;
                    System.out.printf("Saldo Atual: %.1f%n", saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite o valor para sacar: ");
                    double saque = scannerBanco.nextDouble();
                    if (saque <= saldo){
                        saque -= saldo;
                        System.out.printf("Saldo Atual:  %.1f%n", saldo);
                    }else {
                        System.out.println("Saldo Insuficiente!");
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.printf("Saldo atual: %.1f%n", saldo );
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        while(opcao != 0);
        scannerBanco.close();
    }
}