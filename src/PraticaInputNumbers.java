import java.util.Scanner;

public class PraticaInputNumbers {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double number1 = leTeclado.nextDouble();

        System.out.println("Digite outro número: ");
        double number2 = leTeclado.nextDouble();

        double resultado = (number1 + number2)/2;

        System.out.println("Sua média é: " + resultado);

    }
}
