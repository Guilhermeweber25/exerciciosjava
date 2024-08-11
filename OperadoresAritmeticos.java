import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um primeiro numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite um segundo numero: ");
        double num2 = scanner.nextDouble();

        double soma = operacoes.somar(num1 , num2);
        double sub = operacoes.subtrair(num1 , num2);
        double div = operacoes.dividir(num1 , num2);
        double mult = operacoes.multiplicar(num1 , num2);

        System.out.println("Soma : "+soma);
        System.out.println("Subtracao : "+sub);
        System.out.println("Divisao : "+div);
        System.out.println("multiplicacao : "+mult);
    }

}

class operacoes {
    public static double somar(double num1 , double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1 , double num2) {
        return num1 - num2;
    }

    public static  double dividir(double num1 , double num2) {
        return  num1 / num2;
    }

    public  static double multiplicar(double num1 , double num2){
        return num1 * num2;
    }
}


