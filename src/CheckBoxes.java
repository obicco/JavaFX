import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CheckBoxes extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX - Checkbox");

        //Checkboxes
        CheckBox box1 = new CheckBox("Item 1");
        CheckBox box2 = new CheckBox("Item 2");
        box2.setSelected(true); //default checked

        button = new Button("Confirm");
        button.setOnAction(e -> handleOptions(box1, box2));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(box1, box2, button);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void handleOptions(CheckBox box1, CheckBox box2) {
        String message = "Users Order:\n";
        if(box1.isSelected())
            message += "Item 1\n";
        if(box2.isSelected())
            message += "Item 2\n";

        System.out.println(message);
    }
}
