import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int chance = 5;
        int numero = random.nextInt(100)+1;

       while (chance > 0) {
            System.out.println("---Adivinhe o numero---");
           System.out.println("tentativas restantes: "+chance);
            System.out.println("digite o numero: ");
            int resposta = scanner.nextInt();
            if (resposta == numero) {
                System.out.println("Voce acertou!!!");
                System.exit(0);
            } else if (resposta < numero) {
                System.out.println("O palpite esta baixo!");
            }else{
                System.out.println("O palpite esta alto!");
            }
            chance--;
        }
    }
}
