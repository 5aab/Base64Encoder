package com.punjab.encoder;

import java.awt.event.*;
import javax.swing.*;
public class ButtonExample {

    public static void main(String[] args) {
        final JTextField calculatedVal=new JTextField("");

        final JTextField userTf=new JTextField();
        userTf.setBounds(50,10, 150,20);
        final JLabel userLabel =new JLabel();
        userLabel.setBounds(10,10, 40,20);
        userLabel.setText("sid");

        final JPasswordField password=new JPasswordField();
        password.setBounds(50,35, 150,20);
        final JLabel passwordLabel =new JLabel();
        passwordLabel.setBounds(10,35, 40,20);
        passwordLabel.setText("password");

        JFrame frame=new JFrame("Base64 Encoder/Decoder");
        JButton encodeButton=new JButton("Encode");
        encodeButton.setBounds(50,100,80,20);
        encodeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatedVal.setText("Encoded: Basic "+"");
            }
        });
        JButton decodeButton=new JButton("Decode");
        decodeButton.setBounds(132,100,80,20);
        decodeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatedVal.setText("Decoded: "+"");
            }
        });

        frame.add(encodeButton);
        frame.add(decodeButton);

        frame.add(userTf);
        frame.add(userLabel);

        frame.add(password);
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
