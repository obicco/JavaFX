import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class EvHandler extends Application implements EventHandler<ActionEvent> { //EventHandler for handling interactions

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Title of the Window");
        button = new Button();
        button.setText("Click me");
        button.setOnAction(this);           //Reference the event to this class

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene (layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button) {     //if the event source is button, then do so
            System.out.println("Button pressed!");
        }
    }
}
