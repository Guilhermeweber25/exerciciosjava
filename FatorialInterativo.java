public class FatorialInterativo {
    public static int fatoriall(int num) {
        int resultadoo = 1;
        for (int i = 1; i <= num; i++){
            resultadoo = resultadoo * i;
        }
        return resultadoo;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("O fatorial do numero "+num+" e: "+fatoriall(num));
    }
}
