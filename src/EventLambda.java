import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class EventLambda extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Title of the Window");
        button = new Button();
        button.setText("Click me");

        button.setOnAction(e -> System.out.println("Lambda Expression"));  //compact way lambda expression in one line - you can add more System.out


    /*    button.setOnAction(new EventHandler<ActionEvent>() {    //Compact single way
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("I am an anonymous inner class");
            }
        }); */

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene (layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
