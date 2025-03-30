import java.util.Scanner;

public class Menu {
    public static void criacao(){
        System.out.println("Caiu dentro da criacao");
    }
    public static void listar(){
        System.out.println("Caiu dentro da lista");
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int opcao = 0;

        do{
            System.out.println("MENU SUPER FODA");
            System.out.println("1 - CRIAR");
            System.out.println("2 - LISTAR");
            System.out.println("0 - SAIR");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                case 22:
                    System.out.println("Criar");
                    criacao();
                case 2:
                    System.out.println("Listar");
                    listar();
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Esta opção não existe");
            }



        }while (opcao > 0);



        }
    }