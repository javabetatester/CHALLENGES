import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        do {
            try {
                System.out.print("Digite um número inteiro (ou uma letra para sair): ");
                int numero = scanner.nextInt();
                System.out.println("Você digitou: " + numero);

                // Exemplo de operação que pode causar erro
                System.out.print("Digite outro número para dividir o primeiro: ");
                int divisor = scanner.nextInt();

                // Divisão que pode causar exceção
                int resultado = numero / divisor;
                System.out.println("O resultado da divisão é: " + resultado);

                System.out.print("Deseja continuar? (1 para sim, 0 para não): ");
                int opcao = scanner.nextInt();
                continuar = (opcao == 1);

            } catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero não é permitida.");
                scanner.nextLine(); // Limpa o buffer
            } catch (Exception e) {
                System.out.println("Entrada inválida! O programa será encerrado.");
                continuar = false;
                scanner.nextLine(); // Limpa o buffer
            }
        } while (continuar);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}