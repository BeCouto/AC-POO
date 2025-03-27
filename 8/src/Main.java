import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String kwInput = JOptionPane.showInputDialog("Insira o total de energia consumida em kilowatts:");
        double kilowatts = Double.parseDouble(kwInput);

        String valorInput = JOptionPane.showInputDialog("Insira o valor do kilowatt:");
        double valorKilowatt = Double.parseDouble(valorInput);

        double gastoTotal = (kilowatts < 150) ? kilowatts * valorKilowatt * 0.9 : kilowatts * valorKilowatt;

        String resultado = String.format("Valor total a pagar: R$ %.2f", gastoTotal);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
