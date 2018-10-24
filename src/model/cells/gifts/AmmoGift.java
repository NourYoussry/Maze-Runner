package model.cells.gifts;

import javafx.scene.canvas.GraphicsContext;
import model.cells.RoadState;
import model.cells.gifts.states.AmmoGiftState;

public class AmmoGift extends Gift {

    public AmmoGift() {
        this.currentState = new AmmoGiftState();
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
