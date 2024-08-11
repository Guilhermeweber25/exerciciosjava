import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.println("digite um segundo numero: ");
        int num2 = scanner.nextInt();

        int soma = Metodos.somar(num1 , num2);

        System.out.println("O resultado da soma entre: "+num1+" e "+num2+" = "+soma);

    }

    public static int somar(int num1 , int num2){
        return num1 + num2;
    }
}
