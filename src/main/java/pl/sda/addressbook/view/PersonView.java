package pl.sda.addressbook.view;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.sda.addressbook.controller.NewPersonController;
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
        personList.add(new Person("Adam","Adamowski","Ciasna","Wrocław","88-22","444444444"));
        personList.add(new Person("Karol","Karolowski","Polna","Łódź","92-100","5555555555"));
        personList.add(new Person("Stefan","Stefanśki","Rynek","Gdańsk","100-100","44444444"));

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
    public void loadNewPersonView(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/NewPerson.fxml"));
        try{
            loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        Parent parent = loader.getRoot();

        primaryStage.setScene(new Scene(parent,600,400));
        primaryStage.show();






        //1. załadowac fxml
        //2. stworzyc kontroler
        //3. wyswietlić widok
        //4. w klasie NewPersonController stworzyć funkcje savePerson
        //   savePerson ma być wywolywana w momencie kiedy klikniemy
        //   w button save
        //6. nowy Person ustawiamy wartosc z textField
        //dodanie Obiektu na liste
        // getPersonList().add(new Person(" "));
    }
}
