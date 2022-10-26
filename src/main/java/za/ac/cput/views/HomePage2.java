package za.ac.cput.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage2 extends JFrame implements ActionListener {

    private JPanel panelNorth;
    private JPanel panelCenter;
    private JPanel panelSouth;

    private JLabel lblSystemLogo;
    private JLabel lblHeading;

    private JLabel lblPadding1, lblPadding2,lblPadding3,lblPadding4,lblPadding5;

    private JLabel lblPadding6;
    private JButton btnAdmin;
    private JLabel lblPadding7;
    private JButton btnUser;
    private JLabel lblPadding8;
    private JLabel lblPadding9, lblPadding10,lblPadding11,lblPadding12,lblPadding13;

    private JButton btnExit;
    private Font ft1, ft2, ft3;

    public HomePage2(){
        super("Car parking service system ");
        panelNorth = new JPanel();
        panelCenter = new JPanel();
        panelSouth = new JPanel();

        lblSystemLogo = new JLabel(new ImageIcon("finalCar.png"));
        lblHeading = new JLabel("Car Parking Reservation");

        lblPadding1 = new JLabel();
        lblPadding2 = new JLabel();
        lblPadding3 = new JLabel();
        lblPadding4 = new JLabel();
        lblPadding5 = new JLabel();

        lblPadding6 = new JLabel();
        btnAdmin= new JButton("ADMIN");
        lblPadding7 = new JLabel();
        btnUser = new JButton("USER");
        lblPadding8 = new JLabel();

        lblPadding9 = new JLabel();
        lblPadding10 = new JLabel();
        lblPadding11 = new JLabel();
        lblPadding12 = new JLabel();
        lblPadding13 = new JLabel();

        btnExit=new JButton("EXIT");

        ft1 = new Font("Arial", Font.BOLD, 32);
        ft2 = new Font("Arial", Font.PLAIN, 28);
        ft3 = new Font("Arial", Font.PLAIN, 24);
    }

    public void setHomePageGUI() {
        panelNorth.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(3, 5));
        panelSouth.setLayout(new FlowLayout());


        panelNorth.add(lblSystemLogo);
        panelNorth.add(lblHeading);
        lblHeading.setFont(ft1);
        lblHeading.setForeground(Color.black);
        panelNorth.setBackground(new Color(51,204,204));

        lblPadding1.setFont(ft1);
        panelCenter.add(lblPadding1);
        lblPadding2.setFont(ft1);
        panelCenter.add(lblPadding2);
        lblPadding3.setFont(ft1);
        panelCenter.add(lblPadding3);
        lblPadding4.setFont(ft1);
        panelCenter.add(lblPadding4);
        lblPadding5.setFont(ft1);
        panelCenter.add(lblPadding5);

        lblPadding6.setFont(ft1);
        panelCenter.add(lblPadding6);
        btnAdmin.setFont(ft2);
        btnAdmin.setBackground(new Color(102,102,153));
        btnAdmin.setForeground(Color.white);
        btnAdmin.setHorizontalAlignment(JButton.RIGHT);
        panelCenter.add(btnAdmin);
        lblPadding7.setFont(ft1);
        panelCenter.add(lblPadding7);
        btnUser.setFont(ft2);
        btnUser.setBackground(new Color(102,102,153));
        btnUser.setForeground(Color.white);
        btnUser.setHorizontalAlignment(JButton.RIGHT);
        panelCenter.add(btnUser);
        lblPadding8.setFont(ft1);
        panelCenter.add(lblPadding8);

        lblPadding9.setFont(ft1);
        panelCenter.add(lblPadding9);
        lblPadding10.setFont(ft1);
        panelCenter.add(lblPadding10);
        lblPadding11.setFont(ft1);
        panelCenter.add(lblPadding11);
        lblPadding12.setFont(ft1);
        panelCenter.add(lblPadding12);
        lblPadding13.setFont(ft1);
        panelCenter.add(lblPadding13);

        panelCenter.setBackground(Color.darkGray);

        btnExit.setFont(ft3);
        btnExit.setBackground(new Color(205,92,92));
        btnExit.setForeground(Color.black);
        panelSouth.add(btnExit);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnAdmin.addActionListener(this);
        btnUser.addActionListener(this);
        btnExit.addActionListener(this);

        this.setSize(150, 100);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ADMIN")) {
           //
        }
        if (e.getActionCommand().equals("USER")) {
            new UserRegistration().setGui();
            dispose();
        }

        else if (e.getActionCommand().equals("EXIT")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new HomePage2().setHomePageGUI();
    }
}