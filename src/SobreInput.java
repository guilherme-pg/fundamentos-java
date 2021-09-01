import java.util.Scanner;

public class SobreInput {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        String nome = leTeclado.nextLine();
        int age = leTeclado.nextInt();
        // nextLine() default é string, mas pode-se passar o que se pretende criar
        // nextInt(), nextDouble(), nextShort, nextLong(), ...
        System.out.println(age);
        System.out.println(nome);
    }
}
/*
* digite seu nome ---- ola nome
* leia 2 numeros, soma, divide por 2, sua média é: resultado
* */