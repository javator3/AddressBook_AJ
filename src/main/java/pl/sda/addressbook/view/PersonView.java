package pl.sda.addressbook.view;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.sda.addressbook.controller.RootViewController;
import pl.sda.addressbook.model.Person;

import java.io.IOException;

public class PersonView {
    private ObservableList<Person> personList = FXCollections.observableArrayList();
    private Stage primaryStage;



    public PersonView(Stage primaryStage) {
        this.primaryStage = primaryStage;
        personList.add(new Person("Maciej","Kowalski","Parzysta","Kraków","82-200","66666666"));
        personList.add(new Person("Łukasz","Pawlak","Dobra","Bydgoszcz","88-100","111111111"));
        personList.add(new Person("Kacper","Nowak","Prosta","Poznań","83-100","222222222"));
        personList.add(new Person("4","","","","",""));
        personList.add(new Person("5","","","","",""));
        personList.add(new Person("6","","","","",""));

    }

    public PersonView() {

    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void loadView() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/RootView.fxml"));
        try{
            loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        Parent parent = loader.getRoot();

        primaryStage.setScene(new Scene(parent,600,400));

        RootViewController rootViewController = loader.getController();
        rootViewController.setPeronView(this);
        primaryStage.show();



    }

    public void loadNewPersonView() throws IOException {
        Parent PersonView = FXMLLoader.load(getClass().getResource("/NewPerson.fxml"));





    }
}
