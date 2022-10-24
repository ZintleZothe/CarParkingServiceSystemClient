package za.ac.cput.views;

import javax.swing.*;
import java.awt.*;

public class StoreParkingSpace {

    private JFrame mainFrame;
    private JLabel lblSelectParkingLot, lblCurrentNumber;
    private JButton btnAddParkingSpace, btnCancel;

    public StoreParkingSpace(){
        mainFrame = new JFrame("Add ParkingSpace");
        lblSelectParkingLot = new JLabel("Select ParkingLot");
        lblCurrentNumber = new JLabel();
        btnAddParkingSpace = new JButton("+");
        btnCancel = new JButton("Cancel");
    }

    public void setGUI(){
        mainFrame.setLayout(new GridLayout(3, 2));
        mainFrame.add(lblSelectParkingLot);
        mainFrame.add(lblCurrentNumber);
        mainFrame.add(btnAddParkingSpace);
        mainFrame.add(btnCancel);
        mainFrame.setSize(500,200);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args){new StoreParkingSpace().setGUI();}

}


