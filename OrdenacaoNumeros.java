import java.util.Scanner;
import java.util.Arrays;

public class OrdenacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];


        for (int i = 0;i < numeros.length;i++){
            System.out.println("Digite um numero:");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("numeros armazenados: ");
        for (int numero : numeros){
            System.out.print(numero);
        }

    }
}
