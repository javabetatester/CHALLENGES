import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        try {
            System.out.print("Digite qual é o salário base:");
            int salarioBase = sc.nextInt();
            double salarioAumento = (double) ((salarioBase * 0.15) + salarioBase);
            double salarioFinal = (double) (salarioAumento - (salarioAumento * 0.08));
            System.out.println("Esse mês você recebeu:");
            System.out.println("Salário Bruto: R$ "+ salarioBase);
            System.out.println("Salário com Proventos: R$ "+ salarioAumento);
            System.out.println("Salário Líquido: R$ "+ salarioFinal);
            break;
        }catch (Exception e) {
            System.out.println("Digite um salário real");
            sc.nextLine();
        }
        }
    }
}
