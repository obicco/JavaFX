import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxEx extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX - ComboBox");

        button = new Button("Submit");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Selection 1",
                "Selection 2",
                "Selection 3"
        );

        comboBox.setPromptText("Choose your selection");

        //Can add you own option
        comboBox.setEditable(true);

        button.setOnAction(e -> printSelection());

        //Print out during selection
        comboBox.setOnAction(e -> System.out.println("User selected: " + comboBox.getValue()));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(comboBox, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    //Print out the selection
    private void printSelection() {
        System.out.println(comboBox.getValue());
    }
}
