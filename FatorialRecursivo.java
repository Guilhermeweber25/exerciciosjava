public class FatorialRecursivo {

    public static int fatorial(int numero){
        if (numero == 0){
            return 1;
        }else {
            return numero * fatorial(numero - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("O fatorial do numero "+numero+" e: "+fatorial(numero));
    }
}
