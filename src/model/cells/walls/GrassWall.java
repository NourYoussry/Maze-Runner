package model.cells.walls;

import javafx.scene.canvas.GraphicsContext;
import model.cells.CellState;
import model.cells.RoadState;
import model.cells.walls.states.GrassWallState;

public class GrassWall extends Wall {

    private CellState currentState;

    public GrassWall() {
        this.currentState = new GrassWallState();
    }

    @Override
    public void draw(GraphicsContext cell, int x, int y) {
        this.currentState.draw(cell, x, y);
    }

    @Override
    public void receivePlayer() {
        this.currentState.receivePlayer();
    }

    public void destroyWall() {
        this.currentState = new RoadState();
    }

}
