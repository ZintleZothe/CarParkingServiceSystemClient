package za.ac.cput.views;

import com.google.gson.Gson;
import okhttp3.*;
import za.ac.cput.entity.Vehicle;
import za.ac.cput.factory.VehicleFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class VehicleRegistration extends JFrame implements ActionListener {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    private static OkHttpClient client =new OkHttpClient();

    private JPanel panelNorth;
    private JPanel panelCenter;
    private JPanel panelSouth;

    private JLabel lblHeading;

    private JLabel lblPadding1, lblPadding2, lblPadding3;

    private JLabel lblUserID;
    private JTextField txtUserId;
    private JLabel lblUserIdError;

    private JLabel lblNumberPlate;
    private JTextField txtNumberPlate;
    private JLabel lblNumberPlateError;

    private JLabel lblVehicleModel;
    private JTextField txtVehicleModel;
    private JLabel lblVehicleModelError;

    private JLabel lblVehicleColor;
    private JTextField txtVehicleColor;
    private JLabel lblVehicleColorError;

    private JLabel lblPadding4, lblPadding5, lblPadding6;

    private JButton btnSave, btnClear, btnBack;
    private Font ft1, ft2;


    public VehicleRegistration(){
        super("Car parking system > add vehicle");
        panelNorth = new JPanel();
        panelCenter = new JPanel();
        panelSouth = new JPanel();

        lblHeading = new JLabel("Vehicle registration");

        lblPadding1 = new JLabel();
        lblPadding2 = new JLabel();
        lblPadding3 = new JLabel();

        lblUserID = new JLabel("userId: ");
        txtUserId = new JTextField();
        lblUserIdError= new JLabel("*please enter your user id");
        lblUserIdError.setVisible(false);
        lblNumberPlate = new JLabel("Number Plate: ");
        txtNumberPlate = new JTextField();
        lblNumberPlateError = new JLabel("*enter vehicle number-plate");
        lblNumberPlateError.setVisible(false);
        lblVehicleModel = new JLabel("Vehicle Model: ");
        txtVehicleModel = new JTextField();
        lblVehicleModelError= new JLabel("*enter vehicle model");
        lblVehicleModelError.setVisible(false);
        lblVehicleColor = new JLabel("Vehicle Color: ");
        txtVehicleColor= new JTextField();
        lblVehicleColorError = new JLabel("*enter vehicle color");
        lblVehicleColorError.setVisible(false);
        lblPadding4 = new JLabel();
        lblPadding5 = new JLabel();
        lblPadding6 = new JLabel();

        btnSave = new JButton("SAVE");
        btnClear = new JButton("CLEAR");
        btnBack = new JButton("BACK");

        ft1 = new Font("Arial", Font.BOLD, 32);
        ft2 = new Font("Arial", Font.PLAIN, 22);
    }

    public void setGUI(){
        panelNorth.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(6, 3));
        panelSouth.setLayout(new GridLayout(1, 3));

        panelNorth.add(lblHeading);
        lblHeading.setFont(ft1);
        lblHeading.setForeground(Color.BLACK);
        panelNorth.setBackground(new Color(51, 153, 102));

        lblPadding1.setFont(ft1);
        panelCenter.add(lblPadding1);
        lblPadding2.setFont(ft1);
        panelCenter.add(lblPadding2);
        lblPadding3.setFont(ft1);
        panelCenter.add(lblPadding3);


        lblUserID.setFont(ft2);
        lblUserIdError.setFont(ft2);
        lblUserIdError.setForeground(Color.red);
        lblUserID.setHorizontalAlignment(JLabel.RIGHT);
        txtUserId.setFont(ft2);
        panelCenter.add(lblUserID);
        panelCenter.add(txtUserId);
        panelCenter.add(lblUserIdError);

        lblNumberPlate.setFont(ft2);
        lblNumberPlateError.setFont(ft2);
        lblNumberPlateError.setForeground(Color.red);
        lblNumberPlate.setHorizontalAlignment(JLabel.RIGHT);
        txtNumberPlate.setFont(ft2);
        panelCenter.add(lblNumberPlate);
        panelCenter.add(txtNumberPlate);
        panelCenter.add(lblNumberPlateError);

        lblVehicleModel.setFont(ft2);
        lblVehicleModelError.setFont(ft2);
        lblVehicleModelError.setForeground(Color.red);
        lblVehicleModel.setHorizontalAlignment(JLabel.RIGHT);
        txtVehicleModel.setFont(ft2);
        panelCenter.add(lblVehicleModel);
        panelCenter.add(txtVehicleModel);
        panelCenter.add(lblVehicleModelError);

        lblVehicleColor.setFont(ft2);
        lblVehicleColorError.setFont(ft2);
        lblVehicleColorError.setForeground(Color.red);
        lblVehicleColor.setHorizontalAlignment(JLabel.RIGHT);
        txtVehicleColor.setFont(ft2);
        panelCenter.add(lblVehicleColor);
        panelCenter.add(txtVehicleColor);
        panelCenter.add(lblVehicleColorError);

        lblPadding4.setFont(ft1);
        panelCenter.add(lblPadding4);
        lblPadding5.setFont(ft1);
        panelCenter.add(lblPadding5);
        lblPadding6.setFont(ft1);
        panelCenter.add(lblPadding6);

        panelCenter.setBackground(new Color(128,128,128));
        btnSave.setFont(ft2);
        btnClear.setFont(ft2);
        btnBack.setFont(ft2);
        panelSouth.add(btnSave);
        panelSouth.add(btnClear);
        panelSouth.add(btnBack);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);

        btnSave.addActionListener(this);
        btnClear.addActionListener(this);
        btnBack.addActionListener(this);

        this.setSize(400, 400);
        this.pack();
        this.setVisible(true);
    }

    private boolean isInputValid() {
        boolean valid = true;
        if (txtUserId.getText().equals("")) {
            lblUserIdError.setVisible(true);
            txtUserId.requestFocus();
            valid = false;
        }
        else
            lblUserIdError.setVisible(false);

        if (txtNumberPlate.getText().equals("")) {
            lblNumberPlateError.setVisible(true);
            txtNumberPlate.requestFocus();
            valid = false;
        }
        else
            lblNumberPlateError.setVisible(false);

        if (txtVehicleModel.getText().equals("")) {
            lblVehicleModelError.setVisible(true);
            txtVehicleModel.requestFocus();
            valid = false;
        }
        else
            lblVehicleModelError.setVisible(false);

        if (txtVehicleColor.getText().equals("")) {
            lblVehicleColorError.setVisible(true);
            txtVehicleColor.requestFocus();
            valid = false;
        }
        else
            lblVehicleColorError.setVisible(false);

        return valid;
    }

    private void clearForm() {
        txtUserId.setText("");
        lblUserIdError.setVisible(false);
        txtNumberPlate.setText("");
        lblNumberPlateError.setVisible(false);
        txtVehicleModel.setText("");
        lblVehicleModelError.setVisible(false);
        txtVehicleColor.setText("");
        lblVehicleColorError.setVisible(false);
        txtUserId.requestFocus();
    }


    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("SAVE")){
            if(isInputValid()){
                store(txtNumberPlate.getText(),txtUserId.getText(),txtVehicleModel.getText(),txtVehicleColor.getText());
            }
        }
        else if(e.getActionCommand().equals("CLEAR")){
            clearForm();
        }
        else if(e.getActionCommand().equals("BACK")){
            new UserMenu().setGui();
            dispose();
        }
    }

    public void store(String vehicleNumberPlate,String userID,String vehicleModel, String vehicleColour){
        try{
            final String URL="http://localhost:8080/carparkingservice/vehicle/create";

            Vehicle vehicle = VehicleFactory.createVehicle(vehicleNumberPlate,userID,vehicleModel,vehicleColour);
            Gson g= new Gson();
            String jsonString= g.toJson(vehicle);
            String v=post(URL,jsonString);
            if(v != null)
                JOptionPane.showMessageDialog(null,"Saved");
            else
                JOptionPane.showMessageDialog(null,"Error");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }


    }

    public String post(final String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        try(Response response = client.newCall(request).execute()){
            return response.body().string();
        }

    }

    public static void main(String[] args){
        new VehicleRegistration().setGUI();
    }
}

