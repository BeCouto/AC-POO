import javax.swing.JOptionPane;

public class programa {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Insira um valor de tempo em segundos:");
        int t = Integer.parseInt(input);

        int horas = t / 3600;
        int minutos = (t % 3600) / 60;
        int segundos = (t % 3600) % 60;

        String resultado = "Tempo convertido:\nHoras: " + horas + "\nMinutos: " + minutos + "\nSegundos: " + segundos;
        JOptionPane.showMessageDialog(null, resultado);
    }
}
