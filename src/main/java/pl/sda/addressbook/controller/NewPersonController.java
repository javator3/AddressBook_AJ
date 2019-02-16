package pl.sda.addressbook.controller;

import javafx.fxml.FXML;
import pl.sda.addressbook.model.Person;
import pl.sda.addressbook.view.PersonView;

import java.awt.*;

public class NewPersonController {
    @FXML
    TextField name;
    @FXML
    TextField lastname;
    @FXML
    TextField street;
    @FXML
    TextField city;
    @FXML
    TextField postalCode;
    @FXML
    TextField telephone;
    @FXML
    private Button closeButton;

    private PersonView personView;

    public void savePerson(){
        personView.getPersonList().add(new Person("","","","","",""));

    }
    public void setPersonView(PersonView personView){
        this.personView = personView;
    }



}
