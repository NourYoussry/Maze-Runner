package model.cells.bombs;

import javafx.scene.canvas.GraphicsContext;
import model.cells.Cell;

public abstract class Bomb implements Cell {

    public abstract void draw(GraphicsContext cell, int x, int y);
    public abstract void receivePlayer();

}
