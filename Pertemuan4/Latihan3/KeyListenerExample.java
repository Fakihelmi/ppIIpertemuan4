package Pertemuan4.Latihan3;
import javax.swing.*;
import java.awt.event.*;

public class KeyListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListener Example");

        JLabel label = new JLabel("Tekan tombol pada keyboard.");
        label.setBounds(50,50,300,30);

        JTextField textFied = new JTextField();
        textFied.setBounds(50,100,200,30);

        textFied.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            public void keyReleased(KeyEvent e) {
                label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            public void keyTyped(KeyEvent e) {
                label.setText("Key Typed: " + e.getKeyCode());
            }
        });

        frame.add(label);
        frame.add(textFied);

        frame.setSize(400,200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}