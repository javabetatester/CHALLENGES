import java.util.Scanner;

public class Frango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos frango:");
        int frangos = sc.nextInt();
        double chip = 4;
        double anel = 3.5;
        double somaGranja = (chip + anel)*frangos;
        System.out.println("O valor que tu vai gastar é R$"+somaGranja);
    }
}
