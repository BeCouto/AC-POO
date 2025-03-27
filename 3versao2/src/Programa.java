import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário atual:"));
        float percentual = Float.parseFloat(JOptionPane.showInputDialog("Informe o percentual de aumento (%):"));

        float aumento = salario * (percentual / 100);
        float novoSalario = salario + aumento;



        JOptionPane.showMessageDialog(null, "Aumento de: " + aumento);
        JOptionPane.showMessageDialog(null, "O novo salário será de: " + novoSalario);
    }
}



