import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        boolean num = segundo.veri(numero);

        if (segundo.veri(numero)){
            System.out.println("este numero e primo");
        }else {
            System.out.println("este numero nao e primo");
        }
    }
}

class segundo{
    public static boolean veri(int numero) {
        if (numero <= 1){
            return false;
        }

        for(int i = 2;i <= Math.sqrt(numero);i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

}
