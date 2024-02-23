
package questao4caio;

import java.util.Scanner;

public class Questao4Caio {

    public static void main(String[] args) {

        int cont = 0, numero;

        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite um número: ");
        numero = teclado.nextInt();

        if (numero == 0) {
            cont = 1;
        } else {
            while (numero > 0) {
                numero /= 10;

                cont++;
                
            }
        }

        System.out.println("A quantidade de dígitos é: " + cont);

    }

}
