package praticas_02;

import java.util.Scanner;

public class ValidacaoNumeroContaCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite seu numero da conta bancaria: ");
            String numeroConta = scanner.nextLine();
            verificadorNumeroConta(numeroConta);
            System.out.println("Numero de conta valido");
        }catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }finally {
            scanner.close();
        }
    }

    private static void verificadorNumeroConta(String numeroConta) {
        if (numeroConta.length() !=8) {
            throw new IllegalArgumentException("Numero de Conta Invalido. Digite exatamente 8 digitos.");
        }
    }
}
