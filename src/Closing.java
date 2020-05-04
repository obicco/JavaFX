import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class Closing extends Application{

    Stage window;
    Button button;

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX - Closing");

        window.setOnCloseRequest(e -> {
            e.consume();     //consume this event, we gonna take care of the event
            closeProgram();
        });  //On exit from close button in top sx

        button = new Button("Close Program");
        button.setOnAction(e -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram() {
       Boolean answer = ConfirmBox.display("Confirmation", "Sure you want exit?");
       if (answer)
           window.close();
    }
}