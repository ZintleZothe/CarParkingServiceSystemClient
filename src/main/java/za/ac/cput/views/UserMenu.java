package za.ac.cput.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserMenu extends JFrame implements ActionListener {
    private JPanel panelNorth;
    private JPanel panelCenter;
    private JPanel panelSouth;

    private JLabel lblHeading;

    private JLabel lblPadding1, lblPadding2,lblPadding3;

    private JLabel lblPadding4;
    private JButton btnAddVehicle;
    private JLabel lblPadding5;

    private JLabel lblPadding6,lblPadding7, lblPadding8;

    private JLabel lblPadding9;
    private JButton btnViewParkingSpace;
    private JLabel lblPadding10;

    private JLabel lblPadding11,lblPadding12, lblPadding13;

    private JLabel lblPadding14;
    private JButton btnReservation;
    private JLabel lblPadding15;

    private JLabel lblPadding16,lblPadding17, lblPadding18;
    private JLabel lblPadding19;
    private JButton btnPayment;
    private JLabel lblPadding20;

    private JLabel lblPadding21, lblPadding22,lblPadding23;

    private JButton btnHomePage;
    private JButton btnClose;

    private Font ft1, ft2, ft3;


    public UserMenu(){
        super("Car parking system> user menu");
        panelNorth = new JPanel();
        panelCenter = new JPanel();
        panelSouth = new JPanel();

        lblHeading = new JLabel("User Menu");

        lblPadding1 = new JLabel();
        lblPadding2 = new JLabel();
        lblPadding3 = new JLabel();

        lblPadding4 = new JLabel();
        btnAddVehicle= new JButton("REGISTER VEHICLE");
        lblPadding5 = new JLabel();

        lblPadding6 = new JLabel();
        lblPadding7= new JLabel();
        lblPadding8= new JLabel();

        lblPadding9 = new JLabel();
        btnViewParkingSpace = new JButton("VIEW PARKING SPACE");
        lblPadding10 = new JLabel();

        lblPadding11 = new JLabel();
        lblPadding12 = new JLabel();
        lblPadding13= new JLabel();


        lblPadding14= new JLabel();
        btnReservation= new JButton("MAKE RESERVATION");
        lblPadding15= new JLabel();

        lblPadding16 = new JLabel();
        lblPadding17 = new JLabel();
        lblPadding18 = new JLabel();

        lblPadding19= new JLabel();
        btnPayment = new JButton("MAKE PAYMENT");
        lblPadding20= new JLabel();

        lblPadding21 = new JLabel();
        lblPadding22 = new JLabel();
        lblPadding23 = new JLabel();

        btnHomePage=new JButton("HOME PAGE");
        btnClose=new JButton("CLOSE");

        ft1 = new Font("Arial", Font.BOLD, 25);
        ft2 = new Font("Arial", Font.PLAIN, 20);
        ft3 = new Font("Arial", Font.PLAIN, 18);
    }

    public void setGui() {
        panelNorth.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(9, 3));
        panelSouth.setLayout(new FlowLayout());

        panelNorth.add(lblHeading);
        lblHeading.setFont(ft1);
        lblHeading.setForeground(Color.black);
        panelNorth.setBackground(new Color(95, 158, 160));

        lblPadding1.setFont(ft1);
        panelCenter.add(lblPadding1);
        lblPadding2.setFont(ft1);
        panelCenter.add(lblPadding2);
        lblPadding3.setFont(ft1);
        panelCenter.add(lblPadding3);


        lblPadding4.setFont(ft1);
        panelCenter.add(lblPadding4);
        btnAddVehicle.setFont(ft2);
        btnAddVehicle.setBackground(new Color(135,206,0235));
        btnAddVehicle.setForeground(Color.black);
        btnAddVehicle.setHorizontalAlignment(JButton.CENTER);
        panelCenter.add(btnAddVehicle);
        lblPadding5.setFont(ft1);
        panelCenter.add(lblPadding5);

        lblPadding6.setFont(ft1);
        panelCenter.add(lblPadding6);
        lblPadding7.setFont(ft1);
        panelCenter.add(lblPadding7);
        lblPadding8.setFont(ft1);
        panelCenter.add(lblPadding8);

        lblPadding9.setFont(ft1);
        panelCenter.add(lblPadding9);
        btnViewParkingSpace.setFont(ft2);
        btnViewParkingSpace.setBackground(new Color(135,206,0235));
        btnViewParkingSpace.setForeground(Color.black);
        btnViewParkingSpace.setHorizontalAlignment(JButton.CENTER);
        panelCenter.add(btnViewParkingSpace);
        lblPadding10.setFont(ft1);
        panelCenter.add(lblPadding10);

        lblPadding11.setFont(ft1);
        panelCenter.add(lblPadding11);
        lblPadding12.setFont(ft1);
        panelCenter.add(lblPadding12);
        lblPadding13.setFont(ft1);
        panelCenter.add(lblPadding13);


        lblPadding14.setFont(ft1);
        panelCenter.add(lblPadding14);
        btnReservation.setFont(ft2);
        btnReservation.setBackground(new Color(135,206,0235));
        btnReservation.setForeground(Color.black);
        btnReservation.setHorizontalAlignment(JButton.CENTER);
        panelCenter.add(btnReservation);
        lblPadding15.setFont(ft1);
        panelCenter.add(lblPadding15);

        lblPadding16.setFont(ft1);
        panelCenter.add(lblPadding16);
        lblPadding17.setFont(ft1);
        panelCenter.add(lblPadding17);
        lblPadding18.setFont(ft1);
        panelCenter.add(lblPadding18);

        lblPadding19.setFont(ft1);
        panelCenter.add(lblPadding19);
        btnPayment.setFont(ft2);
        btnPayment.setBackground(new Color(135,206,0235));
        btnPayment.setForeground(Color.black);
        btnPayment.setHorizontalAlignment(JButton.CENTER);
        panelCenter.add(btnPayment);
        lblPadding20.setFont(ft1);
        panelCenter.add(lblPadding20);


        lblPadding21.setFont(ft1);
        panelCenter.add(lblPadding21);
        lblPadding22.setFont(ft1);
        panelCenter.add(lblPadding22);
        lblPadding23.setFont(ft1);
        panelCenter.add(lblPadding23);


        panelCenter.setBackground(Color.darkGray);

        btnHomePage.setFont(ft3);
        btnHomePage.setBackground(new Color(135,206,235));
        btnHomePage.setForeground(Color.black);
        panelSouth.add(btnHomePage);

        btnClose.setFont(ft3);
        btnClose.setBackground(new Color(135,206,235));
        btnClose.setForeground(Color.black);
        panelSouth.add(btnClose);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);

        btnAddVehicle.addActionListener(this);
        btnViewParkingSpace.addActionListener(this);
        btnReservation.addActionListener(this);
        btnPayment.addActionListener(this);
        btnHomePage.addActionListener(this);
        btnClose.addActionListener(this);

        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("REGISTER VEHICLE")) {
             new VehicleRegistration().setGUI();
             dispose();
        }
        if (e.getActionCommand().equals("VIEW PARKING SPACE")) {
            //view parking space page
        }

        else if (e.getActionCommand().equals("MAKE RESERVATION")) {
            //reservation page
        }

        else if (e.getActionCommand().equals("MAKE PAYMENT")) {
            //Payment page
        }

        else if (e.getActionCommand().equals("HOME PAGE")) {
            new HomePage2().setHomePageGUI();
            dispose();
        }
        else if (e.getActionCommand().equals("CLOSE")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new UserMenu().setGui();
    }

}
