import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome = scanner.next();
        System.out.println("digite sua idade: ");
        int idade = scanner.nextInt();

        int age = EntradaDados.verificar(idade);

        System.out.println("Seja bem-vindo(a), "+nome+", sua idade eh : "+age);
    }
    public static int verificar(int idade) {
        if (idade < 18) {
            System.out.println("Idade invalida! nao pode entrar!");
            System.exit(0);
            return 0;
        }else{
            System.out.println("Idade valida! pode entrar!");
            return idade;
        }
    }
}
