package za.ac.cput.views;

import za.ac.cput.entity.ParkingLot;
import za.ac.cput.factory.ParkingLotFactory;

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
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args){new StoreParkingLot().setGUI();}


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnCancel){
            System.exit(0);
        }

        if(e.getSource() == btnSave){
            String URL = "http://localhost:8080/parkinglot/create";
            ParkingLot parkingLot = ParkingLotFactory.build(txtAddParkingLotCampusName.getText(), txtAddParkingLotNumber.getText());

        }
    }

    public void store(String campusName, String parkingLotNumber){

    }
}
