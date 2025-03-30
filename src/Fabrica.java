import java.util.Scanner;

public class Fabrica {
    public static void main(String[] args) {
        int p = 10;
        int m =  12;
        int g = 15;

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
            System.out.print("Digite quantas camisetas P vai precisar:");
            int camisetasp = sc.nextInt();
            System.out.print("Digite quantas camisetas M vai precisar:");
            int camisetam = sc.nextInt();
            System.out.print("Digite quantas camisetas G vai precisar:");
            int camisetag = sc.nextInt();
            int totalv = (camisetag + camisetam + camisetasp);
            int totalc = (camisetasp * p)+ (camisetam * m)+ (camisetag * g);
            System.out.println("Você terá que desembolsar um total de R$ "+ totalc+" por "+ totalv +" camisetas.");
            break;
        }catch(Exception e) {
                System.out.println("Digite um NUMERO de camisetas.");
                sc.nextLine();
            }
        } sc.close();
    }
}
