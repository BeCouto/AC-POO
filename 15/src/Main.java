import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int vogais = 0, digitos = 0, outros = 0;
        char c;

        String entrada = JOptionPane.showInputDialog("Digite caracteres (finalize com '.'):");

        int i = 0;
        while (i < entrada.length()) {
            c = entrada.charAt(i);
            if (c == '.') break;

            if ("aeiouAEIOU".indexOf(c) != -1) {
                vogais++;
            } else if (Character.isDigit(c)) {
                digitos++;
            } else {
                outros++;
            }
            i++;
        }

        JOptionPane.showMessageDialog(null, "Quantidade de vogais: " + vogais +
                "\nQuantidade de dígitos: " + digitos +
                "\nQuantidade de outros caracteres: " + outros);
    }
}
