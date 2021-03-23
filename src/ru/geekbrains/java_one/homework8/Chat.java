package ru.geekbrains.java_one.homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Chat extends JFrame {


    public static void main(String[] args) {
        new Chat();
    }

    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_POSX = 450;
    private static final int WINDOW_POSY = 200;

    private TextField textField;
    private TextArea textArea;


    Chat() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setTitle("Chat");
        setResizable(false);

        textArea = new TextArea();
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        add(bottomPanel, BorderLayout.SOUTH);

        JButton btnSend = new JButton("Send");
        bottomPanel.add(btnSend, BorderLayout.EAST);

        textField = new TextField();
        bottomPanel.add(textField, BorderLayout.CENTER);

        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().trim().isEmpty()) {
                    String newMessage = textField.getText();
                    textArea.append(newMessage + "\n");
                    textField.setText("");
                }
            }
        });

        KeyListener keyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String newMessage = textField.getText();
                    textArea.append(newMessage + "\n");
                    textField.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

        textField.addKeyListener(keyListener);

            setVisible(true);

    }






}
