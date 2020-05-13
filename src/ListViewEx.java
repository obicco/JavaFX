import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewEx extends Application {

    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX - ListView");
        button = new Button("Submit");

        listView = new ListView<>();
        listView.getItems().addAll("Item1", "Item2", "Item3", "Item4", "Item5");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);  //Multiple selection with ctrl/cmd/shift

        button.setOnAction(e -> buttonClicked());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(listView, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void buttonClicked() {
        String message = "";
        ObservableList<String> items;
        items = listView.getSelectionModel().getSelectedItems();

        for(String i: items) {
            message += i + "\n";
        }
        System.out.println(message);
    }
}
