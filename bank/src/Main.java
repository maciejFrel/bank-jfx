import Types.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    private int _nextId = 0;
    private int _nextConsultantNumber = 0;
    private int _nextAccountantNumber = 0;
    private final List<Person> _people = new ArrayList<>();

    @Override
    public void start(Stage mainStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("views/sample.fxml"));

        initialize();

//        var stackPane = new StackPane();
        var layout = new VBox(10);
        var button = new Button();
        var list = new ListView<Person>();

        button.setText("HALO");
        button.setOnAction((e) -> {
            _people.remove(0);
            list.getItems().setAll(_people);
            System.out.println(getChuj());
        });


        list.getItems().setAll(_people);
        list.setCellFactory(param -> new ListCell<Person>() {
            @Override
            protected void updateItem(Person person, boolean empty) {
                super.updateItem(person, empty);
                if (empty || person == null || person.getName() == null) {
                    setText(null);
                } else {
                    setText(person.getName());
                }
            }
        });
        list.getSelectionModel().selectedIndexProperty().addListener((ChangeListener) (observable, oldValue, newValue) -> {
            Platform.runLater(() -> {
                list.getSelectionModel().select(-1);
            });
        });
        list.setMaxHeight(300);

        mainStage.setTitle("Bank");
        mainStage.setScene(new Scene(layout, 500, 500));
        mainStage.show();

        layout.setSpacing(10);
        layout.getChildren().addAll(button, list);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public String getChuj() {
        return "DSADSA";
    }

    public void addClient() {
        var client = new Client(_people.get(_people.size() - 1).getId() + 1, "Test", Gender.Male, new BigDecimal(123));
        _people.add(client);
    }

    private void initialize() {
        // adding Managers
        _people.add(new Manager(getNextId(), "Adam Małysz", Gender.Male, new BigDecimal(12400), "Business Manager"));
        _people.add(new Manager(getNextId(), "Edyta Górniak", Gender.Female, new BigDecimal(9500), "Director"));
        // adding Consultants
        _people.add(new Consultant(getNextId(), "Jacek Graniecki", Gender.Male, new BigDecimal(4020), getNextConsultantNumber()));
        _people.add(new Consultant(getNextId(), "Borys Przybylski", Gender.Male, new BigDecimal(3540), getNextConsultantNumber()));
        // adding Accountants
        _people.add(new Accountant(getNextId(), "Damian Niestrzelaj", Gender.Male, new BigDecimal(3700), getNextAccountantNumber()));
        _people.add(new Accountant(getNextId(), "Mery Spolsky", Gender.Female, new BigDecimal(4300), getNextAccountantNumber()));
        // adding Guards
        _people.add(new Guard(getNextId(), "Grzesiu Śliwa", Gender.Male, new BigDecimal(6000), true));
        _people.add(new Guard(getNextId(), "Uwos Mamoros", Gender.Male, new BigDecimal(3000), false));
        // adding Clients
        _people.add(new Client(getNextId(), "Filip Szcześniak", Gender.Male, new BigDecimal(3400)));
        _people.add(new Client(getNextId(), "Jerzy Fikumiku", Gender.Male, new BigDecimal(8800)));
        _people.add(new Client(getNextId(), "Joanna Aloha", Gender.Female, new BigDecimal(200)));
    }

    private int getNextId() {
        return _nextId++;
    }

    ;

    private int getNextConsultantNumber() {
        return _nextConsultantNumber++;
    }

    ;

    private int getNextAccountantNumber() {
        return _nextAccountantNumber++;
    }

    ;
}
