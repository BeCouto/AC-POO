import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        int n = Integer.parseInt(input);

        String resultado = (n % 2 == 0) ? "O número " + n + " é par." : "O número " + n + " é ímpar.";
        JOptionPane.showMessageDialog(null, resultado);
    }
}
