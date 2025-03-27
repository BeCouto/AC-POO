import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int n, inferior, superior;
        boolean valido;

        do {
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
                inferior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite inferior do intervalo:"));
                superior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior do intervalo:"));
                valido = true;

                String resultado;
                if (n < inferior) {
                    resultado = "O número " + n + " está antes do intervalo.";
                } else if (n > superior) {
                    resultado = "O número " + n + " está depois do intervalo.";
                } else {
                    resultado = "O número " + n + " está dentro do intervalo.";
                }
                JOptionPane.showMessageDialog(null, resultado);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números inteiros.");
                valido = false;
            }
        } while (!valido);
    }
}
