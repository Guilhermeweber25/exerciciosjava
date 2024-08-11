import java.util.Scanner;

public class ContagemVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next();

        int resultado = classificar.vogais(palavra);
        System.out.println("Vogais encontradas: " + resultado);
    }
}

class classificar {
    public static int vogais(String palavra) {
        int contadorVogais  = 0;

        String palavraMinuscula = palavra.toLowerCase();


        for (int i = 0; i < palavraMinuscula.length(); i++) {
            char letra = palavraMinuscula.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
               contadorVogais++;
            }
        }
        return contadorVogais;
    }
}
