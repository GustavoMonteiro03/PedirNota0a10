import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a nota de 0 a 10: ");
        int nota = input.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
            case 6:
                System.out.println("Suficiente");
                break;
            case 7:
            case 8:
                System.out.println("Bom");
                break;
            case 9:
                System.out.println("Notável");
                break;
            case 10:
                System.out.println("Muito Bom");
                break;
            default:
                System.out.println("Nota inválida!");
        }
    }
}
