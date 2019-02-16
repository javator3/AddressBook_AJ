package pl.sda.addressbook.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXML;
import pl.sda.addressbook.model.Person;

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

}
