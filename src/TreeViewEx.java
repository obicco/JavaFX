import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TreeViewEx extends Application {

    Stage window;
    TreeView<String> tree;

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX - TreeView");

        TreeItem<String> root, out, src;

        //Setting root
        root = new TreeItem<>();
        root.setExpanded(true);     //everything expanded by default

        //Out branch
        out = makeBranch("Out", root);
        makeBranch("First out children", out);
        makeBranch("Second out children", out);
        makeBranch("Third out children", out);

        //Src branch
        src = makeBranch("Src", root);
        makeBranch("First src children", src);
        makeBranch("Second src children", src);
        makeBranch("Third src children", src);

        //Create Tree
        tree = new TreeView<>(root);
        tree.setShowRoot(false);        //root is just a container so we make it invisible
        tree.getSelectionModel().selectedItemProperty()
                .addListener((v, oldValue, newValue) -> {
                    if(newValue != null)
                        System.out.println(newValue.getValue());
                });

        //Layout
        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    //Creates branches
    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}
