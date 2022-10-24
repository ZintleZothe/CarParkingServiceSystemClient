package za.ac.cput.views;

import javax.swing.*;
import java.awt.*;

public class HomePage {

    private JFrame mainFrame;
    private JLabel lblTitle;
    private JButton btnLogin, btnSignin;

    public HomePage(){
        mainFrame = new JFrame("HomePage");
        lblTitle = new JLabel("Book a Space");
        btnLogin = new JButton("Login");
        btnSignin = new JButton("Signin");
    }

    public void setGUI(){
        mainFrame.setLayout(new GridLayout(2,2));
        mainFrame.add(lblTitle);
        mainFrame.add(btnLogin);
        mainFrame.add(btnSignin);
        mainFrame.setSize(500, 200);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args){new HomePage().setGUI();}
}
