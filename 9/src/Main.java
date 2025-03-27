import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double x;
        while (true) {
            try {
                x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real:"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite um número real.");
            }
        }

        int arredondado = (x - (int) x < 0.5) ? (int) x : (int) x + 1;

        JOptionPane.showMessageDialog(null, "Número arredondado: " + arredondado);
    }
}
