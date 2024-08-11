import java.util.Scanner;

public class EstruturaCondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero: ");
        Integer num1 = scanner.nextInt();

        int verificar = operation.verificar(num1);
    }
}

class operation{
    public static int verificar(int num1) {
        if (num1 % 2 == 0) {
            System.out.println("este numero e par!!!");
        }else{
            System.out.println("este numero e impar!!!");
        }
        return num1;
    }
}