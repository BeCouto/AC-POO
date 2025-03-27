import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro (a):"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro (b):"));

        if (a > b) { // Garante que o menor número seja 'a'
            int temp = a;
            a = b;
            b = temp;
        }

        int soma = 0, count = 0;
        StringBuilder pares = new StringBuilder("Números pares no intervalo: ");

        for (int i = a; i <= b; i++) {
            soma += i;
            count++;
            if (i % 2 == 0) {
                pares.append(i).append(" ");
            }
        }

        double media = (double) soma / count;
        JOptionPane.showMessageDialog(null, pares + "\nSoma: " + soma + "\nMédia: " + media);
    }
}
