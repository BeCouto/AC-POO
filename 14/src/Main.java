import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double nota, soma = 0, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;
        int count = 0;

        do {
            nota = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota (ou -1 para encerrar):"));
            if (nota == -1) break;

            soma += nota;
            count++;

            if (nota > maior) maior = nota;
            if (nota < menor) menor = nota;

        } while (true);

        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Nenhuma nota foi inserida.");
        } else {
            double media = soma / count;
            JOptionPane.showMessageDialog(null, "Quantidade de alunos: " + count +
                    "\nMédia da turma: " + media +
                    "\nMaior nota: " + maior +
                    "\nMenor nota: " + menor);
        }
    }
}
