// Main application class that loads and displays the DrawLines GUI
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DrawSteppedLines extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        // loads DrawSteppedLines.fxml and configures the DrawSteppedLinesController
        Parent root = FXMLLoader.load(getClass().getResource("DrawSteppedLines.fxml"));

        Scene scene = new Scene(root); // attach scene graph to scene
        stage.setTitle("Draw Lines"); // set the window's title
        stage.setScene(scene); // attach scene to stage
        stage.show(); // display the stage
    }

    public static void main(String[] args){
        launch(args); // create a DrawSteppedLines object and call its start method
    }
}
