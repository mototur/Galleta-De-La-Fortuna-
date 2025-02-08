import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GalletaDeLaFortuna {

    private static String[] mensajes = {
            "Tu vida tendrá nuevos proyectos.",
            "Obtendrás el carro de tus sueños.",
            "Tu crush se te declarará.",
            "Muy pronto encontrarás trabajo.",
            "Recibirás buenas noticias pronto.",
            "Atrévete hoy.",
            "Ganarás la lotería."
    };

    public static void main(String[] args) {

        JFrame frame = new JFrame("Galleta de la Fortuna");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        frame.getContentPane().setBackground(new Color(230, 230, 250));

        JLabel label = new JLabel("Tu mensaje de la Fortuna hoy es: ", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        label.setBackground(new Color(240, 240, 255));
        label.setForeground(new Color(75, 0, 130));
        label.setOpaque(true);
        frame.add(label, BorderLayout.CENTER);

        JButton boton = new JButton("Generar Mensaje");
        boton.setBackground(new Color(138, 43, 226));
        boton.setForeground(Color.WHITE);
        frame.add(boton, BorderLayout.SOUTH);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int indiceAleatorio = random.nextInt(mensajes.length);
                label.setText(mensajes[indiceAleatorio]);
            }
        });

        frame.setVisible(true);
    }
}
