import java.util.Scanner;

public class Acidente {
    public static void main(String[] args) {
        System.out.print("Escreva quantos dias estamos sem acidente:");
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
            int dias = sc.nextInt();
            int ano = dias / 360;
            int meses = (dias % 360) / 30;
            int diasRestantes = dias % 30;
            System.out.println("Estamos há " + ano + " anos, " + meses + " meses e " + diasRestantes + " dias sem acidente.");
            break;
        }catch (Exception e){
            System.out.println("Digite DIAS por favor, não letras ou caracteres.");
            sc.nextLine();
        }
        }
    }
}
