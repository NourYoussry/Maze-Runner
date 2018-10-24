package model.infopanel;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.util.Observable;
import java.util.Observer;

public class InfoPanel implements Observer {

    private Canvas canvas;
    GraphicsContext panel;

    /* Reference to the singleton object. */
    private static final InfoPanel infoPanel = new InfoPanel();

    /**
     * Private constructor (Singleton DP).
     */
    private InfoPanel() {

    }

    /**
     * This method is the only way to reference the singleton InfoPanel object.
     * @return reference to the InfoPanel object.
     */
    public static InfoPanel getInfoPanel() {
        return infoPanel;
    }

    public void setCanvas (Canvas canvas) {
        this.canvas = canvas;
    }

    public void drawPanel () {
        panel = canvas.getGraphicsContext2D();
        panel.setFill(Color.RED);
        panel.drawImage(new Image("view/resources/score.png"), 0, 15);
    }

    @Override
    public void update(Observable observable, Object o) {
        panel.clearRect(0, 0, 672, 32);
        panel.setFill(Color.RED);
        panel.fillRect(0,0,672,32);
        panel.strokeText("Score: " + o, 16 , 16);
    }

}
