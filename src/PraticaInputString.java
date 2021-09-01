import java.util.Scanner;

public class PraticaInputString {
    public static void main(String[] args) {

        Scanner leTeclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leTeclado.nextLine();

        System.out.println("Olá " + nome);

    }
}
