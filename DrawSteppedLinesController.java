// Using strokeline to connect (0,0) corner to 
// the upper left half of the canvas
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawSteppedLinesController {

    @FXML
    private Canvas canvas;

    @FXML
    void drawLinesButtonPressed(ActionEvent event) {
    
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        // original for reference
        // gc.strokeLine(0, 0, canvas.getWidth(), canvas.getHeight());

        // gc.strokeLine(canvas.getWidth(), 0, 0, canvas.getHeight());

        double widths = canvas.getWidth()/20;
        double heights = canvas.getHeight()/20;

        double vertical_step = canvas.getHeight();
        double right_step =  0;

        for(int i = 0; i< 20; i++){
            gc.strokeLine(0, 0, right_step, vertical_step);
            right_step+=widths;
            vertical_step-=heights;
        }
    }

}
