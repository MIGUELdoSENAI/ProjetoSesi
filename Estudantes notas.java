import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Consultar informações do estudante
        String nome;
        int nota;

        // Entradas
        System.out.println("informar o nome do estudante ");
        nome = input.nextLine();
        System.out.println("informar a nota do estudante ");
        nota = input.nextInt();

        // Processamento
        if (nota >= 50) {
            System.out.println("Estudante esta aprovado ");
        } else {
            System.out.println("Estudante esta reprovado ");
        }
    }
}
