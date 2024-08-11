import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String voltar;
        int resultado;

        do {
            System.out.println("Digite um numero:");
            int num1 = scanner.nextInt();
            System.out.println("Digite um segundo numero:");
            int num2 = scanner.nextInt();
            System.out.println("---Escolha uma opcao---");
            System.out.println("1 - Somar");
            System.out.println("2 - subtrair");
            System.out.println("3 - dividir");
            System.out.println("4 - multiplicar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("---soma---");
                    resultado = num1 + num2;
                    System.out.println("resultado: "+resultado);
                    break;
                case 2:
                    System.out.println("---subtracao---");
                    resultado = num1 - num2;
                    System.out.println("resultado: "+resultado);
                    break;
                case 3:
                    System.out.println("---divisao---");
                    resultado = num1 / num2;
                    System.out.println("resultado: "+resultado);
                    break;
                case 4:
                    System.out.println("---multiplicacao---");
                    resultado = num1 * num2;
                    System.out.println("resultado: "+resultado);
                default:

            }
            System.out.println("deseja realizar uma nova operacao? S/N");
            voltar = scanner.next();
        } while (voltar.equals("S") || voltar.equals("s"));

    }
}
