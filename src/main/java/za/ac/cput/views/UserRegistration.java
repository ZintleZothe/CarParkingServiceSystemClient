package za.ac.cput.views;

import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import za.ac.cput.entity.Role;
import za.ac.cput.entity.User;
import za.ac.cput.entity.Vehicle;
import za.ac.cput.factory.RoleFactory;
import za.ac.cput.factory.UserFactory;
import za.ac.cput.factory.VehicleFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class UserRegistration extends JFrame implements ActionListener {

    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    private static OkHttpClient client =new OkHttpClient();



    private JPanel panelNorth;
    private JPanel panelCenter;
    private JPanel panelSouth;

    private JLabel lblHeading;

    private JLabel lblPadding1, lblPadding2, lblPadding3;

    private JLabel lblRoleName;
    private JComboBox comboRoleName;
    private JLabel lblPadding4;

//    private JLabel lblUserId;
//    private JTextField txtUserId;
//    private JLabel lblPadding5;

    private JLabel lblFirstName;
    private JTextField txtFirstName;
    private JLabel lblFirstNameError;

    private JLabel lblLastName;
    private JTextField txtLastName;
    private JLabel lblLastNameError;

    private JLabel lblAddress;
    private JTextField txtAddress;
    private JLabel lblAddressError;

    private JLabel lblCellPhone;
    private JTextField txtCellPhone;
    private JLabel lblCellPhoneError;

    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblEmailError;

    private JLabel lblPadding6, lblPadding7, lblPadding8;

//    private JLabel lblNumberPlate;
//    private JTextField txtNumberPlate;
//    private JLabel lblNumberPlateError;
//
//    private JLabel lblVehicleModel;
//    private JTextField txtVehicleModel;
//    private JLabel lblVehicleModelError;
//
//    private JLabel lblVehicleColor;
//    private JTextField txtVehicleColor;
//    private JLabel lblVehicleColorError;
//
//    private JLabel lblPadding9, lblPadding10, lblPadding11;

    private JButton btnSave, btnClear,btnBack, btnNext;
    private Font ft1, ft2,ft3;


    public UserRegistration(){
        super("Add user");

        panelNorth = new JPanel();
        panelCenter = new JPanel();
        panelSouth = new JPanel();

        lblHeading = new JLabel("User Personal Details");

        lblPadding1 = new JLabel();
        lblPadding2 = new JLabel();
        lblPadding3 = new JLabel();

        lblRoleName = new JLabel("User role:");
        comboRoleName = new JComboBox();
        comboRoleName.addItem("Lecturer");
        comboRoleName.addItem("Student");
        lblPadding4 = new JLabel();

//        lblUserId=new JLabel("User Id");
//        txtUserId = new JTextField("auto-generated");
//        txtUserId.setEnabled(false);
//        lblPadding5 = new JLabel();

        lblFirstName = new JLabel("First name: ");
        txtFirstName = new JTextField();
        lblFirstNameError = new JLabel("*enter first name");
        lblFirstNameError.setVisible(false);

        lblLastName= new JLabel("last name: ");
        txtLastName= new JTextField();
        lblLastNameError = new JLabel("*enter last name");
        lblLastNameError.setVisible(false);

        lblAddress = new JLabel("Address: ");
        txtAddress = new JTextField();
        lblAddressError = new JLabel("*enter address");
        lblAddressError.setVisible(false);

        lblCellPhone = new JLabel("Cell phone number: ");
        txtCellPhone = new JTextField();
        lblCellPhoneError= new JLabel("*enter cell phone number ");
        lblCellPhoneError.setVisible(false);

        lblEmail = new JLabel("Email address: ");
        txtEmail = new JTextField();
        lblEmailError = new JLabel("*enter email address");
        lblEmailError.setVisible(false);

        lblPadding6 = new JLabel();
        lblPadding7 = new JLabel();
        lblPadding8 = new JLabel();

//        lblNumberPlate = new JLabel("Number Plate: ");
//        txtNumberPlate = new JTextField();
//        lblNumberPlateError = new JLabel("*enter vehicle number-plate");
//        lblNumberPlateError.setVisible(false);
//
//        lblVehicleModel = new JLabel("Vehicle Model: ");
//        txtVehicleModel = new JTextField();
//        lblVehicleModelError= new JLabel("*enter vehicle model");
//        lblVehicleModelError.setVisible(false);
//
//        lblVehicleColor = new JLabel("Vehicle Color: ");
//        txtVehicleColor= new JTextField();
//        lblVehicleColorError = new JLabel("*enter vehicle color");
//        lblVehicleColorError.setVisible(false);
//
//        lblPadding9 = new JLabel();
//        lblPadding10 = new JLabel();
//        lblPadding11 = new JLabel();
        btnSave  =new JButton("SAVE");
        btnClear =new JButton("CLEAR");
        btnBack  =new JButton("BACK");
        btnNext  =new JButton("NEXT");

        ft1 = new Font("Arial", Font.BOLD, 28);
        ft2 = new Font("Arial", Font.PLAIN, 20);

    }

    public void setGui(){
        panelNorth.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(8, 3));
        panelSouth.setLayout(new GridLayout(1, 4));

        panelNorth.add(lblHeading);
        lblHeading.setFont(ft1);
        lblHeading.setForeground(Color.BLACK);
        panelNorth.setBackground(new Color(51, 153, 102));

        lblPadding1.setFont(ft2);
        panelCenter.add(lblPadding1);
        lblPadding2.setFont(ft2);
        panelCenter.add(lblPadding2);
        lblPadding3.setFont(ft2);
        panelCenter.add(lblPadding3);

        lblRoleName.setFont(ft2);
        lblRoleName.setHorizontalAlignment(JLabel.RIGHT);
        comboRoleName.setFont(ft2);
        panelCenter.add(lblRoleName);
        panelCenter.add(comboRoleName);
        panelCenter.add(lblPadding4);

//        lblUserId.setFont(ft2);
//        lblUserId.setHorizontalAlignment(JLabel.RIGHT);
//        txtUserId.setFont(ft2);
//        panelCenter.add(lblUserId);
//        panelCenter.add(txtUserId);
//        panelCenter.add(lblPadding5);

        lblFirstName.setFont(ft2);
        lblFirstNameError.setFont(ft2);
        lblFirstNameError.setForeground(Color.red);
        lblFirstName.setHorizontalAlignment(JLabel.RIGHT);
        txtFirstName.setFont(ft2);
        panelCenter.add(lblFirstName);
        panelCenter.add(txtFirstName);
        panelCenter.add(lblFirstNameError);

        lblLastName.setFont(ft2);
        lblLastNameError.setFont(ft2);
        lblLastNameError.setForeground(Color.red);
        lblLastName.setHorizontalAlignment(JLabel.RIGHT);
        txtLastName.setFont(ft2);
        panelCenter.add(lblLastName);
        panelCenter.add(txtLastName);
        panelCenter.add(lblLastNameError);

        lblAddress.setFont(ft2);
        lblAddressError.setFont(ft2);
        lblAddressError.setForeground(Color.red);
        lblAddress.setHorizontalAlignment(JLabel.RIGHT);
        txtAddress.setFont(ft2);
        panelCenter.add(lblAddress);
        panelCenter.add(txtAddress);
        panelCenter.add(lblAddressError);

        lblCellPhone.setFont(ft2);
        lblCellPhoneError.setFont(ft2);
        lblCellPhoneError.setForeground(Color.red);
        lblCellPhone.setHorizontalAlignment(JLabel.RIGHT);
        txtCellPhone.setFont(ft2);
        panelCenter.add(lblCellPhone);
        panelCenter.add(txtCellPhone);
        panelCenter.add(lblCellPhoneError);

        lblEmail.setFont(ft2);
        lblEmailError.setFont(ft2);
        lblEmailError.setForeground(Color.red);
        lblEmail.setHorizontalAlignment(JLabel.RIGHT);
        txtEmail.setFont(ft2);
        panelCenter.add(lblEmail);
        panelCenter.add(txtEmail);
        panelCenter.add(lblEmailError);

        lblPadding6.setFont(ft2);
        panelCenter.add(lblPadding6);
        lblPadding7.setFont(ft2);
        panelCenter.add(lblPadding7);
        lblPadding8.setFont(ft2);
        panelCenter.add(lblPadding8);

//        lblNumberPlate.setFont(ft2);
//        lblNumberPlateError.setFont(ft2);
//        lblNumberPlateError.setForeground(Color.red);
//        lblNumberPlate.setHorizontalAlignment(JLabel.RIGHT);
//        txtNumberPlate.setFont(ft2);
//        panelCenter.add(lblNumberPlate);
//        panelCenter.add(txtNumberPlate);
//        panelCenter.add(lblNumberPlateError);
//
//        lblVehicleModel.setFont(ft2);
//        lblVehicleModelError.setFont(ft2);
//        lblVehicleModelError.setForeground(Color.red);
//        lblVehicleModel.setHorizontalAlignment(JLabel.RIGHT);
//        txtVehicleModel.setFont(ft2);
//        panelCenter.add(lblVehicleModel);
//        panelCenter.add(txtVehicleModel);
//        panelCenter.add(lblVehicleModelError);
//
//        lblVehicleColor.setFont(ft2);
//        lblVehicleColorError.setFont(ft2);
//        lblVehicleColorError.setForeground(Color.red);
//        lblVehicleColor.setHorizontalAlignment(JLabel.RIGHT);
//        txtVehicleColor.setFont(ft2);
//        panelCenter.add(lblVehicleColor);
//        panelCenter.add(txtVehicleColor);
//        panelCenter.add(lblVehicleColorError);
//
//        lblPadding9.setFont(ft1);
//        panelCenter.add(lblPadding9);
//        lblPadding10.setFont(ft1);
//        panelCenter.add(lblPadding10);
//        lblPadding11.setFont(ft1);
//        panelCenter.add(lblPadding11);


        panelCenter.setBackground(new Color(128,128,128));
        btnSave.setFont(ft2);
        btnClear.setFont(ft2);
        btnBack.setFont(ft2);
        btnNext.setFont(ft2);
        panelSouth.add(btnSave);
        panelSouth.add(btnClear);
        panelSouth.add(btnBack);
        panelSouth.add(btnNext);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);

        btnSave.addActionListener(this);
        btnClear.addActionListener(this);
        btnBack.addActionListener(this);
        btnNext.addActionListener(this);

        this.pack();
        this.setVisible(true);

    }

    private boolean isInputValid() {
        boolean valid = true;
        if (txtFirstName.getText().equals("")) {
            lblFirstNameError.setVisible(true);
            txtFirstName.requestFocus();
            valid = false;
        }
        else
            lblFirstNameError.setVisible(false);

        if (txtLastName.getText().equals("")) {
            lblLastNameError.setVisible(true);
            txtLastName.requestFocus();
            valid = false;
        }
        else
            lblLastNameError.setVisible(false);

        if (txtAddress.getText().equals("")) {
            lblAddressError.setVisible(true);
            txtAddress.requestFocus();
            valid = false;
        }
        else
            lblAddressError.setVisible(false);

        if (txtCellPhone.getText().equals("")) {
            lblCellPhoneError.setVisible(true);
            txtCellPhone.requestFocus();
            valid = false;
        }
        else
            lblCellPhoneError.setVisible(false);

        if (txtEmail.getText().equals("")) {
            lblEmailError.setVisible(true);
            txtEmail.requestFocus();
            valid = false;
        }
        else
            lblEmailError.setVisible(false);

//        if (txtNumberPlate.getText().equals("")) {
//            lblNumberPlateError.setVisible(true);
//            txtNumberPlate.requestFocus();
//            valid = false;
//        }
//        else
//            lblNumberPlateError.setVisible(false);
//
//        if (txtVehicleModel.getText().equals("")) {
//            lblVehicleModelError.setVisible(true);
//            txtVehicleModel.requestFocus();
//            valid = false;
//        }
//        else
//            lblVehicleModelError.setVisible(false);
//
//        if (txtVehicleColor.getText().equals("")) {
//            lblVehicleColorError.setVisible(true);
//            txtVehicleColor.requestFocus();
//            valid = false;
//        }
//        else
//            lblVehicleColorError.setVisible(false);

        return valid;
    }

    private void clearForm() {
        comboRoleName.setSelectedIndex(0);
        txtFirstName.setText("");
        lblFirstNameError.setVisible(false);
        txtLastName.setText("");
        lblLastNameError.setVisible(false);
        txtAddress.setText("");
        lblAddressError.setVisible(false);
        txtCellPhone.setText("");
        lblCellPhoneError.setVisible(false);
        txtEmail.setText("");
        lblEmailError.setVisible(false);
//        txtNumberPlate.setText("");
//        lblNumberPlateError.setVisible(false);
//        txtVehicleModel.setText("");
//        lblVehicleModelError.setVisible(false);
//        txtVehicleColor.setText("");
//        lblVehicleColorError.setVisible(false);
        comboRoleName.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnSave){
            if(isInputValid()) {
                storeRole(comboRoleName.getSelectedItem().toString());
                storeUser(txtFirstName.getText(), txtLastName.getText(),
                        txtAddress.getText(), txtCellPhone.getText(),
                        txtEmail.getText());
              //  storeVehicle(txtNumberPlate.getText(),txtVehicleModel.getText(),txtVehicleColor.getText());
                clearForm();
            }
        }
        else if(e.getSource()==btnClear) {
            clearForm();
        }
        else if(e.getSource()==btnBack) {
            new HomePage2().setHomePageGUI();
            dispose();
        }
        else if(e.getSource()==btnNext) {
            new UserMenu().setGui();
        }

    }

    public void storeRole(String roleName){
        try{
            final String URL="http://localhost:8080/carparkingservice/role/create";
            Role role = RoleFactory.createRole(roleName);
            Gson g= new Gson();
            String jsonString= g.toJson(role);
            String r=post(URL,jsonString);
//            if(r != null)
//                JOptionPane.showMessageDialog(null,"Saved: "+ role.toString());
//            else
//                JOptionPane.showMessageDialog(null,"Error");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }




    public void storeUser(String firstName, String lastName, String address, String cellNumber, String emailAddress){
        try{
            final String URL="http://localhost:8080/carparkingservice/user/create";
            User user= UserFactory.build(firstName,lastName,address,cellNumber,emailAddress);
            Gson g= new Gson();
            String jsonString= g.toJson(user);
            String u=post(URL,jsonString);
            if(u != null)
                JOptionPane.showMessageDialog(null,"Saved!!,");
            else
                JOptionPane.showMessageDialog(null,"Error");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

    }


//    public void storeVehicle(String vehicleNumberPlate,String vehicleModel, String vehicleColour){
//        try{
//            final String URL="http://localhost:8080/carparkingservice/vehicle/create";
//
//            Vehicle vehicle = VehicleFactory.createVehicle(vehicleNumberPlate,vehicleModel,vehicleColour);
//            Gson g= new Gson();
//            String jsonString= g.toJson(vehicle);
//            String v=post(URL,jsonString);
////            if(v != null)
////                JOptionPane.showMessageDialog(null,"Saved");
////            else
////                JOptionPane.showMessageDialog(null,"Error");
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e.getMessage());
//        }
//
//
//    }

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
        new UserRegistration().setGui();
    }
}

