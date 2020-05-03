import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class AlertBoxesMain extends Application{

    Stage window;
    Button buttonAlert;
    Button buttonConfirm;

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Alert Box App");

        buttonAlert = new Button("Alert");
        buttonAlert.setOnAction(e -> AlertBox.display("Alert Box", "Be careful, ALERT BOX!"));

        buttonConfirm = new Button("Confirm");
        buttonConfirm.setOnAction(e -> {
            boolean result = ConfirmBox.display("Title of Window", "Are you sure?");
            System.out.println(result);
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(buttonAlert, buttonConfirm);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
