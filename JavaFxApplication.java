/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ivy
 */
public class JavaFxApplication extends Application {
    
    class ContactManager {
        private ArrayList<Contact> contactList;

        public ContactManager() {
            contactList = new ArrayList<Contact>();
        }

        public ArrayList<Contact> getContactList() {
            return contactList;
        }
        
        public Contact searchByName(String fname, String lname){
            for (Contact contact : contactList){
                if (contact.getFirstName().equals(fname) && 
                   contact.getLastName().equals(lname)){
                    return contact;
                }
            }
            return null;
        }
        
        public boolean addContact(Contact c) {
            for (Contact contact : contactList) {
                if (contact.getFirstName().equals(c.getFirstName()) &&
                    contact.getLastName().equals(c.getLastName()))
                    return false;
            }
            contactList.add(c);
            return true;
        }
        
        public boolean editContact(Contact c) {
            for (Contact contact : contactList) {
                if (contact.getFirstName().equals(c.getFirstName()) &&
                    contact.getLastName().equals(c.getLastName())) {
                    contact.setHomePhone(c.getHomePhone());
                    contact.setWorkPhone(c.getWorkPhone());
                    contact.setHomeAddress(c.getHomeAddress());
                    contact.setEmail(c.getEmail());
                    contact.setBirthday(c.getBirthday());
                    contact.setNotes(c.getNotes());
                    return true;
                }
            }
            return false;
        }
        
        public boolean deleteContact(Contact c) {
            for (Contact contact : contactList) {
                if (contact.getFirstName().equals(c.getFirstName()) &&
                    contact.getLastName().equals(c.getLastName())){
                    contactList.remove(contact);
                    return true;
                }    
            }
            return false;
        }
    }
    
    ContactManager cm = new ContactManager();
    
    @Override
    public void start(Stage primaryStage) {
        
        //---------main grid---------
        GridPane mainGrid = new GridPane();
        mainGrid.setAlignment(Pos.CENTER);
        mainGrid.setHgap(10); //horizontal gap
        mainGrid.setVgap(10); //vertical gap
        mainGrid.setPadding(new Insets(25,25,25,25));
        Text scenetitle = new Text("Welcome!\nThis application manages contacts.\nYou may add, edit, delete, view and search contacts.");
        mainGrid.add(scenetitle,0, 0, 2, 3);
        
        
        //--------set main scene----------
        Scene main = new Scene(mainGrid, 800, 500);
        primaryStage.setTitle("Contact Manager");
        primaryStage.setScene(main);
        
        //----------create form grid-------
        GridPane form = new GridPane();
        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);
        form.setPadding(new Insets(25,25,25,25));
        
        //--------set add contact scene----------
        Scene addContactScene = new Scene(form, 800, 500);

        //--------create main grid components and set action--------
        Button addContact = new Button();
        addContact.setText("Add New Contact");
        mainGrid.add(addContact, 1, 3);
        addContact.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(addContactScene);
            }
        });
        

        
        
        //---------create form components------------
        Label temp1 = new Label("12345");
        Label temp2 = new Label("12345");
        Label temp3 = new Label("12345");
        Label temp4 = new Label("12345");      
        TextField temp5 = new TextField();
        temp5.setPrefColumnCount(5); 
        temp5.setPromptText("e.g John");
        TextField temp6 = new TextField();
        temp6.setPrefColumnCount(5); 
        temp6.setPromptText("e.g John");
        
        //DatePicker calender = new DatePicker();
        Text formTitle  = new Text("Contact Information Form");
        
        Label fName = new Label("First Name:");
        TextField fNameTextField = new TextField();
        fNameTextField.setPrefColumnCount(5); 
        fNameTextField.setPromptText("e.g John");
        
        Label lName = new Label("Last Name:");
        TextField lNameTextField = new TextField();
        lNameTextField.setPrefColumnCount(5); 
        lNameTextField.setPromptText("e.g Doe");
        
        Label hPhone = new Label("Home Phone:");
        TextField hPhoneTextField = new TextField();
        hPhoneTextField.setPrefColumnCount(5); 
        hPhoneTextField.setPromptText("e.g 416-123-4567");
        
        Label wPhone = new Label("Work Phone:");
        TextField wPhoneTextField = new TextField();
        wPhoneTextField.setPrefColumnCount(5); 
        wPhoneTextField.setPromptText("e.g 416-123-4567");
        
        Label address = new Label("Home Address");
        Label street1 = new Label("Street 1:");
        TextField street1TextField = new TextField();
        street1TextField.setPrefColumnCount(5); 
        street1TextField.setPromptText("e.g 37 Dartnell Ave #3");
        
        Label street2 = new Label("Street 2:");
        TextField street2TextField = new TextField();
        street2TextField.setPrefColumnCount(5); 
        street2TextField.setPromptText("e.g 37 Dartnell Ave #3");
        
        Label city = new Label("City:");
        TextField cityTextField = new TextField();
        cityTextField.setPrefColumnCount(5); 
        cityTextField.setPromptText("e.g Toronto");
        
        Label postal = new Label("Postal Code:");
        TextField postalTextField = new TextField();
        postalTextField.setPrefColumnCount(5); 
        postalTextField.setPromptText("e.g M5R 3A3");
        
        Label province = new Label("Province:");
        TextField provinceTextField = new TextField();
        provinceTextField.setPrefColumnCount(5); 
        provinceTextField.setPromptText("e.g ON");
        
        Label country = new Label("Country:");
        TextField countryTextField = new TextField();
        countryTextField.setPrefColumnCount(5); 
        countryTextField.setPromptText("e.g Canada");
        
        Label email = new Label("E-mail:");
        TextField emailTextField = new TextField();
        emailTextField.setPrefColumnCount(5); 
        emailTextField.setPromptText("e.g john@gmail.com");
        
        Label birthday = new Label("Birthday (YYYY/MM/DD):");
        TextField dayTextField = new TextField();
        dayTextField.setPrefColumnCount(5); 
        dayTextField.setPromptText("e.g 25");
        TextField monthTextField = new TextField();
        monthTextField.setPrefColumnCount(5); 
        monthTextField.setPromptText("e.g 12");
        TextField yearTextField = new TextField();
        yearTextField.setPrefColumnCount(5); 
        yearTextField.setPromptText("e.g 1990");
        
        Label notes = new Label("Extra Notes:");
        TextArea notesTextArea = new TextArea();
        notesTextArea.setPromptText("e.g Favorite color is blue.");
        
        Text result = new Text();
        
        Button back = new Button();
        back.setText("Back to Menu");
        
        Button add = new Button();
        add.setText("Add Contact");
        
        
        
        
        //----------add components to form-------
        form.add(temp1, 0, 0, 1, 1);
        form.add(temp5, 1, 0, 1, 1);
        form.add(temp2, 2, 0, 1, 1);
        form.add(temp3, 3, 0, 1, 1);
        form.add(temp4, 4, 0, 1, 1);
        form.add(temp6, 5, 0, 1, 1);
        temp1.setVisible(false);
        temp5.setVisible(false);
        temp2.setVisible(false);
        temp3.setVisible(false);
        temp4.setVisible(false);
        temp6.setVisible(false);
        
        form.add(formTitle, 0, 0, 3, 1);
        form.add(back, 5, 0);
        form.add(fName, 0, 1, 1, 1);
        form.add(fNameTextField, 1, 1, 2, 1);
        form.add(lName, 3, 1, 1, 1);
        form.add(lNameTextField, 4, 1, 2, 1);
        form.add(birthday, 0, 2, 2, 1);
        //form.add(calender, 1 ,2);
        form.add(yearTextField, 2, 2, 1, 1); 
        form.add(monthTextField, 3, 2, 1, 1); 
        form.add(dayTextField, 4, 2, 1, 1);
        form.add(hPhone, 0, 3, 1, 1);
        form.add(hPhoneTextField, 1, 3, 2, 1);
        form.add(wPhone, 3, 3, 1, 1);
        form.add(wPhoneTextField, 4, 3, 2, 1);
        form.add(address, 0, 5, 2, 1);
        form.add(street1, 0, 6, 1, 1);
        form.add(street1TextField, 1, 6, 2, 1);
        form.add(street2, 3, 6, 1, 1);
        form.add(street2TextField, 4, 6, 2, 1);
        form.add(city, 0, 7, 1, 1);
        form.add(cityTextField, 1, 7, 2, 1);
        form.add(postal, 3, 7, 1, 1);
        form.add(postalTextField, 4, 7, 2, 1);
        form.add(province, 0, 8, 1, 1);
        form.add(provinceTextField, 1, 8, 2, 1);
        form.add(country, 3, 8, 1, 1);
        form.add(countryTextField, 4, 8, 2, 1);
        form.add(email, 0, 4, 4, 1);
        form.add(emailTextField, 1, 4, 4, 1);
        form.add(notes, 0, 9, 1, 1);
        form.add(notesTextArea, 1, 9, 5, 2);
        form.add(result, 0, 12, 4, 1);
        form.add(add, 5, 12);
        
        //----------form button action---------
        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (fNameTextField.getText().isEmpty() || lNameTextField.getText().isEmpty() || 
                    dayTextField.getText().isEmpty() || monthTextField.getText().isEmpty() || yearTextField.getText().isEmpty()){
                    Alert missingAlert = new Alert(Alert.AlertType.ERROR);
                    missingAlert.setTitle("Missing Fields!!!");
                    missingAlert.setContentText("Full name and birth date must be filled out!");
                    missingAlert.initOwner(form.getScene().getWindow());
                    missingAlert.show();
                }
                else if (!dayTextField.getText().isEmpty() && !monthTextField.getText().isEmpty() && !yearTextField.getText().isEmpty()){
                    try{
                        Integer.parseInt(dayTextField.getText());
                        Integer.parseInt(monthTextField.getText());
                        Integer.parseInt(yearTextField.getText()); 
                        Contact newContact = new Contact(fNameTextField.getText(), lNameTextField.getText(), 
                        hPhoneTextField.getText(), wPhoneTextField.getText(), 
                        new Address(street1TextField.getText(), street2TextField.getText(), cityTextField.getText(), 
                        postalTextField.getText(), provinceTextField.getText(), countryTextField.getText()), 
                        emailTextField.getText(), new MyDate(Integer.parseInt(dayTextField.getText()), 
                        Integer.parseInt(monthTextField.getText()), Integer.parseInt(yearTextField.getText())),
                        notesTextArea.getText());
                        if (cm.addContact(newContact)) {
                            result.setFill(Color.GREEN);
                            result.setText(newContact.getFirstName() + " " + newContact.getLastName() + " is added to contact list.");
                        }
                        else {
                            result.setFill(Color.RED);
                            result.setText("Contact " + newContact.getFirstName() + " " + newContact.getLastName() + " already exist!");
                        }
                    }
                    catch (Exception e) {
                        Alert inputErrorAlert = new Alert(Alert.AlertType.ERROR);
                        inputErrorAlert.setTitle("Error Input!!!");
                        inputErrorAlert.setContentText("Birth date must be integers!");
                        inputErrorAlert.initOwner(form.getScene().getWindow());
                        inputErrorAlert.show();
                    }
                }
            }
        });
        
        back.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(main);
            }
        });
        
        
        
        
        
        
        
        

        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
