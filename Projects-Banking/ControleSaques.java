package praticas_02;

import java.util.Scanner;

public class ControleSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();

        for (int i = 1; ; i++) {
            System.out.print("Informe o valor do saque (ou 0 para encerrar): ");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break;
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break;
            } else {
                limiteDiario -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.2f%n", limiteDiario);
            }
        }


        scanner.close();
    }
}
