package za.ac.cput.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoreParkingLot implements ActionListener {

    private JFrame mainFrame;
    private JLabel lblAddParkingLotTitle;
    private JLabel lblAddCampusNameText;
    private JLabel lblAddLotNumber;
    private JTextField txtAddParkingLotCampusName;
    private JTextField txtAddParkingLotNumber;
    private JButton btnSave, btnCancel;

    public StoreParkingLot(){

        mainFrame = new JFrame("Add ParkingLot");
        lblAddParkingLotTitle = new JLabel("Add ParkingLot");
        lblAddCampusNameText = new JLabel("Add Campus Name");
        lblAddLotNumber = new JLabel("Add Lot number");
        txtAddParkingLotCampusName = new JTextField();
        txtAddParkingLotNumber = new JTextField();
        btnSave = new JButton("Save");
        btnCancel = new JButton("Cancel");
    }

    public void setGUI(){
        mainFrame.setLayout(new GridLayout(3,2));
        //mainFrame.add(lblAddParkingLotTitle);
        mainFrame.add(lblAddCampusNameText);
        mainFrame.add(txtAddParkingLotCampusName);
        mainFrame.add(lblAddLotNumber);
        mainFrame.add(txtAddParkingLotNumber);
        mainFrame.add(btnSave);
        mainFrame.add(btnCancel);
        mainFrame.setSize(500, 200);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args){new StoreParkingLot().setGUI();}


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
