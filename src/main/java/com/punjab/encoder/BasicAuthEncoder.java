package com.punjab.encoder;

import java.awt.event.*;
import javax.swing.*;
public class BasicAuthEncoder {

    public static void main(String[] args) {
        final JTextField calculatedVal=new JTextField("");

        final JTextField userTf=new JTextField();
        userTf.setBounds(80,10, 150,20);
        final JLabel userLabel =new JLabel();
        userLabel.setBounds(10,10, 70,20);
        userLabel.setText("sid");

        final JPasswordField passwordField=new JPasswordField();
        passwordField.setBounds(80,35, 150,20);
        final JLabel passwordLabel =new JLabel();
        passwordLabel.setBounds(10,35, 70,20);
        passwordLabel.setText("password");

        JFrame frame=new JFrame("Base64 Encoder/Decoder");
        final JButton decodeButton=new JButton("Decode");
        final JButton encodeButton=new JButton("Encode");
        encodeButton.setBounds(80,100,80,20);
        encodeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatedVal.setText("Encoded: Basic "+"");
                encodeButton.setEnabled(false);
                passwordLabel.setVisible(false);
                passwordField.setVisible(false);
                decodeButton.setEnabled(true);
                encodeButton.setEnabled(false);
                userLabel.setText("Encoded Val ");
            }
        });


        decodeButton.setBounds(162,100,80,20);
        decodeButton.setEnabled(false);
        decodeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatedVal.setText("Decoded: "+"");
                passwordLabel.setVisible(true);
                passwordField.setVisible(true);
                encodeButton.setEnabled(true);
                decodeButton.setEnabled(false);
                userLabel.setText("sid");
            }
        });

        frame.add(encodeButton);
        frame.add(decodeButton);

        frame.add(userTf);
        frame.add(userLabel);

        frame.add(passwordField);
        frame.add(passwordLabel);

        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setVisible(true);

        //userLabel.setBounds(50,70, 250,20);
        calculatedVal.setEditable(false);
        calculatedVal.setBackground(null); //this is the same as a JLabel
        calculatedVal.setBorder(null); //remove the border
        calculatedVal.setBounds(50,70, 250,20);
        frame.add(calculatedVal);
    }

}
