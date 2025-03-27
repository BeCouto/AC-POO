import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] operacoes = {"+", "-", "*", "/"};
        String op;
        boolean operacaoValida = false;

        // Valida a operação usando um loop for
        for (int i = 0; i < operacoes.length; i++) {
            op = JOptionPane.showInputDialog("Digite a operação desejada (+, -, *, /):");
            for (String operacao : operacoes) {
                if (op.equals(operacao)) {
                    operacaoValida = true;
                    break;
                }
            }
            if (operacaoValida) {
                break;
            }
            JOptionPane.showMessageDialog(null, "Operação inválida! Tente novamente.");
        }

        double a, b;
        while (true) {
            try {
                a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
                b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite números válidos.");
            }
        }

        double resultado = 0;
        switch (op) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                if (b == 0) {
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!");
                    return;
                }
                resultado = a / b;
                break;
        }

        JOptionPane.showMessageDialog(null, String.format("%.2f %s %.2f = %.2f", a, op, b, resultado));
    }
}
