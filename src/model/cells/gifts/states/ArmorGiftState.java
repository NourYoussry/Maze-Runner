package model.cells.gifts.states;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import model.cells.CellState;
import model.cells.characters.player.Player;
import model.cells.characters.player.states.ArmoredState;

public class ArmorGiftState implements CellState {

    /* The giftPath is the location of the gift's image on drive. */
    private String giftPath;
    private Image sprite;

    public ArmorGiftState() {
        this.giftPath = "view/resources/ArmorSet.png";
        this.sprite = new Image(giftPath);
    }

    @Override
    public void draw(GraphicsContext cell, int x, int y) {
        cell.drawImage(sprite, x * 32, y * 32);
    }

    @Override
    public void receivePlayer() {
        Player player = Player.getPlayer();
        player.setPlayerState(new ArmoredState());
    }
}
