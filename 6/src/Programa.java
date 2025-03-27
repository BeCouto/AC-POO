import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        float distancia = Float.parseFloat(JOptionPane.showInputDialog("Coloque a distância percorrida (em km): "));
        float tempo = Float.parseFloat(JOptionPane.showInputDialog("Coloque o tempo gasto (em horas): "));
        float combustivel = Float.parseFloat(JOptionPane.showInputDialog("Coloque a quantidade de combustível consumido (em litros): "));

        float kmh = distancia / tempo;
        float kml = distancia / combustivel;

        JOptionPane.showMessageDialog(null, "Velocidade média: " + kmh + " km/h\nConsumo de combustível: " + kml + " km/l");



    }
}
