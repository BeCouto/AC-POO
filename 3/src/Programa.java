import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o salário atual: ");
        float salario = teclado.nextFloat();

        System.out.println("Informe o percentual de aumento (%): ");
        float percentual = teclado.nextFloat();

        float aumento = salario * (percentual / 100);
        float novoSalario = salario + aumento;

        System.out.println("Aumento de " + aumento);
        System.out.println("O novo salário será de R$ " + novoSalario);

    }
}
