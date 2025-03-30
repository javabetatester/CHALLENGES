import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ferraduras = 4;
        System.out.print("Escreva para ganhar:");
        Scanner sc = new Scanner(System.in);
        while (true) {
            try{
                int cavalos = sc.nextInt();
                int haras = cavalos * ferraduras;
                System.out.println("O total de ferraduras necessárias para o Harass, são: "+ haras);
                break;
            }catch(Exception e){
                System.out.println("Escreva um numero válido:");
                sc.nextLine();
            }
        }
    }
}