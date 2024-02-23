
package questao2caio;

import java.util.Scanner;

public class Questao2Caio {

    public static void main(String[] args) {

        float criterioA, criterioB;

        int n1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos livros você quer? ");
        n1 = teclado.nextInt();

        criterioA = (float) ((n1 * 0.25) + 7.50);
        criterioB = (float) ((n1 * 0.50) + 2.50);

        if (criterioA == criterioB) {
            System.out.println("Qualquer plano é bom para você.");

        } else if (criterioA > criterioB) {
            System.out.println("O criterio B é o ideal.");

        } else {
            System.out.println("O criterio A é o ideal.");
        }

    }

}
