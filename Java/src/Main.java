import javax.swing.JOptionPane;

public class Main
{
    public static void main(String[] args)
    {
        Convertir obj = new Convertir();
        float v;
        v = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite velocidad: (m/s)"));
        obj.setVelocidad(v);
        JOptionPane.showMessageDialog(null, obj.getVelocidad() + "m/s =" + obj.kilometrosPorHora() + "km/h");
    }
}
