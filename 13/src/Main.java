import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de alunos:"));

        int i = 0;
        double soma = 0;
        while (i < n) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno " + (i + 1) + ":"));
            soma += nota;
            i++;
        }

        double media = soma / n;
        JOptionPane.showMessageDialog(null, "Média da turma: " + media);
    }
}
