package za.ac.cput.views;

import com.google.gson.Gson;
import okhttp3.*;
import za.ac.cput.entity.ParkingLot;
import za.ac.cput.factory.ParkingLotFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class StoreParkingLot implements ActionListener {

    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static OkHttpClient client = new OkHttpClient();

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
        btnSave.addActionListener(this);
        btnCancel.addActionListener(this);
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
            store(txtAddParkingLotCampusName.getText(),txtAddParkingLotNumber.getText());
            txtAddParkingLotCampusName.setText("");
            txtAddParkingLotNumber.setText("");

        }
    }

    public void store(String campusName, String parkingLotNumber){
        try {
            String URL = "http://localhost:8080/carparkingservice/parkinglot/create";
            ParkingLot parkingLot = ParkingLotFactory.build(txtAddParkingLotCampusName.getText(), txtAddParkingLotNumber.getText());
            Gson gson = new Gson();
            String jsonString = gson.toJson(parkingLot);
            String c = post(URL, jsonString);
            if (c != null) {
                JOptionPane.showMessageDialog(null, "Success save");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder().url(url).post(body).build();
        try(Response response = client.newCall(request).execute()){
            return response.body().string();
        }
    }
}
