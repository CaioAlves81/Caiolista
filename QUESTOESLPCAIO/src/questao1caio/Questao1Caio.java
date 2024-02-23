
package questao1caio;
import java.util.Scanner;
public class Questao1Caio {

   
    public static void main(String[] args) {
        
        float n1, n2, n3, media, recuperacao, medfinal;
          
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite três notas: ");
        
        n1 = teclado.nextFloat();

        n2 = teclado.nextFloat();

        n3 = teclado.nextFloat();

        media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println("Você está aprovado.");

        } else {
            System.out.println("Você está reprovado. Faça recuperação.");
            recuperacao = teclado.nextFloat();
            medfinal = (media+recuperacao)/2;
             
            if (medfinal>=5){
                System.out.println("Aprovado");
            } else {
                System.out.println("Você foi reprovado.");
            }
        }


           
        
    }
    
}
