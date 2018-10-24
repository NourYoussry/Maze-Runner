package model.cells.bombs;

import javafx.scene.canvas.GraphicsContext;
import model.cells.CellState;
import model.cells.RoadState;
import model.cells.bombs.states.FreezeBombState;

public class FreezeBomb extends Bomb {

    private CellState currentState;

    public FreezeBomb() {
        this.currentState = new FreezeBombState();
    }

    @Override
    public void draw(GraphicsContext cell, int x, int y) {
        this.currentState.draw(cell, x, y);
    }

    @Override
    public void receivePlayer() {
        this.currentState.receivePlayer();
        this.currentState = new RoadState();
    }
}
