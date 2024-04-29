package Antonio;

import java.util.Scanner;

public class Antonio2904 {

    public static void main(String[] args) {
        int somaIdades = 0;
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a idade (digite 0 para encerrar): ");
            int idade = sc.nextInt();

            if (idade == 0) break;

            somaIdades += idade;
            contador++;
        }

        if (contador == 0) {
            System.out.println("Nenhuma idade foi inserida.");
        } else {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idades digitadas é: " + media);
        }

        sc.close();
    }
}
