import java.util.Scanner;

public class ConverteTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = 0;
        String voltar;

        do {
            System.out.println("----Escolha uma opcao para converter----");
            System.out.println("1 - celsius");
            System.out.println("2 - fahrenheit");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("---Converte celsius para fahrenheit---");
                    System.out.println("digite a temperatura: ");
                    temp = scanner.nextDouble();
                    double conversao1 = (temp * 1.8) + 32;
                    System.out.println("A conversao resulta em: "+conversao1+"ºF");
                    break;
                case 2:
                    System.out.println("---Converte fahrenheit para celsius---");
                    System.out.println("digite a temperatura: ");
                    temp = scanner.nextDouble();
                    double conversao2 = (temp / 1.8)- 32;
                    System.out.println("A conversao resulta em: "+conversao2+"ºC");
                    break;
                default:
            }
            System.out.println("---Deseja fazer outra conversao? S/N");
            voltar = scanner.next();
        }while (voltar.equals("S")||voltar.equals("s"));
    }
}
