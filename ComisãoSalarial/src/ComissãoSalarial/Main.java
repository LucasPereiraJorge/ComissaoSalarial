package ComissãoSalarial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu salário: ");
        double salário = scanner.nextDouble();
        System.out.println("Informe o quanto você vendeu: ");
        double vendas = scanner.nextDouble();
        System.out.println("Informe a sua taxa de comissão");
        double taxaComissão = scanner.nextDouble();

        float total = (float) ((float) salário + (taxaComissão/100 * vendas));

        System.out.println("O salário final é igual a: " + total);
    }
}
