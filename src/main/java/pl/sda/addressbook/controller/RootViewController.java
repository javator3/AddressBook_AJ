package pl.sda.addressbook.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pl.sda.addressbook.model.Person;
import pl.sda.addressbook.view.PersonView;

import java.net.URL;
import java.util.ResourceBundle;

public class RootViewController implements Initializable {



    @FXML
    private Label nameLabel;
    @FXML
    private Label lastnameLabel;
    @FXML
    private Label streetLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label postaCodeLabel;
    @FXML
    private Label telephoneLabel;
    @FXML
    private TableView<Person> personTableView;
    @FXML
    private TableColumn<Person, String> nameCol;
    @FXML
    private TableColumn<Person, String> lastNameCol;
    @FXML
    private TableColumn<Person, String> streetCol;
    @FXML
    private TableColumn<Person,String> cityCol;
    @FXML
    private TableColumn<Person,String> postalCodeCol;
    @FXML
    private TableColumn<Person,String> telephoneCol;

    private PersonView peronView;

    public void setPeronView(PersonView peronView){
        this.peronView = peronView;
        personTableView.setItems(peronView.getPersonList());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameCol.setCellValueFactory(c -> c.getValue().nameProperty());
        lastNameCol.setCellValueFactory(c -> c.getValue().lastnameProperty());
        streetCol.setCellValueFactory(c -> c.getValue().streetProperty());
        cityCol.setCellValueFactory(c -> c.getValue().cityProperty());
        postalCodeCol.setCellValueFactory(c -> c.getValue().postalCodeProperty());
        telephoneCol.setCellValueFactory(c -> c.getValue().telephoneProperty());
    }
}
