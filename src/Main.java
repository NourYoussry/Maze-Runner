
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
<<<<<<< HEAD


=======
>>>>>>> 279bda8cd752aabe460cd4dd9004982379ab8d54
        Parent root = FXMLLoader.load(getClass().getResource("/view/Scenes/MainScene.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1024, 668));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
