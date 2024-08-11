import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();


        if (isPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }

        scanner.close();
    }

    // Método que verifica se uma palavra é um palíndromo
    public static boolean isPalindromo(String palavra) {

        String palavraLimpa = palavra.replaceAll("\\s+", "").toLowerCase();


        int inicio = 0;
        int fim = palavraLimpa.length() - 1;


        while (inicio < fim) {
            if (palavraLimpa.charAt(inicio) != palavraLimpa.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }
}
