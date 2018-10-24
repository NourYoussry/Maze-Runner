package model.cells.walls;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class StoneWall extends Wall {

    /* The wallPath is the location of the wall's image on drive. */
    private String wallPath;
    private Image sprite;

    public StoneWall() {
        this.wallPath = "view/resources/block1.png";
        this.sprite = new Image(wallPath);
    }

    @Override
    public void draw(GraphicsContext cell, int x, int y) {
        cell.drawImage(sprite, x * 32, y * 32);
    }

    @Override
    public void receivePlayer() {
    }

}
