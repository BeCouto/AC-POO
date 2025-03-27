import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float valor1, valor2;
        System.out.println("Informe o primeiro valor: ");
        valor1 = teclado.nextFloat();
        System.out.println("Informe o segundo valor: ");
        valor2 = teclado.nextFloat();

        System.out.println("Resultado da soma: " + (valor1 + valor2));
        System.out.println("Resultado da subtração: " + (valor1 - valor2));
        System.out.println("Resultado da multiplicação: " + (valor1 * valor2));
        System.out.println("Resultado da divisão: " + (valor1 / valor2));
    }
}
