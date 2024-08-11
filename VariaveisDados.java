import java.util.Scanner;
public class VariaveisDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor com o tipo correspondente: ");
        System.out.println("Digite um valor inteiro: ");
        Integer inteiro = scanner.nextInt();
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next();
        System.out.println("Digite um numero boleano: ");
        Boolean boleano = scanner.nextBoolean();
        System.out.println("Digite um double: ");
        String input = scanner.next();
        Double doouble = Double.parseDouble(input);

        System.out.println();
        System.out.print("inteiro: "+inteiro+" caracter: "+palavra+"  boleano: "+boleano+" double: "+doouble);
        scanner.close();
    }
}
