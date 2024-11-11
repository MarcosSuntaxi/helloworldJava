import javax.swing.*;

public class HelloWorldSwing {
    public static void main(String[] args) {
        // Crear una ventana con título
        JFrame frame = new JFrame("Hola Mundo con Interfaz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear una etiqueta con el texto
        JLabel label = new JLabel("¡Hola, Mundo!", SwingConstants.CENTER);
        label.setFont(label.getFont().deriveFont(30.0f));
        
        // Añadir la etiqueta a la ventana
        frame.getContentPane().add(label);

        // Ajustar el tamaño y mostrar la ventana
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
