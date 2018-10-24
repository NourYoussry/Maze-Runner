package model.cells.gifts.states;

import com.sun.javafx.iio.gif.GIFImageLoader2;
import com.sun.javafx.iio.gif.GIFImageLoaderFactory;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import model.cells.CellState;
import model.cells.characters.player.Player;

public class HealthGiftState implements CellState {

    /* The giftPath is the location of the gift's image on drive. */
    private String giftPath;
    private Image sprite;

    public HealthGiftState() {

        this.giftPath = "view/resources/foodGift.gif";
        this.sprite = new Image(giftPath);
    }

    @Override
    public void draw(GraphicsContext cell, int x, int y) {
        cell.drawImage(sprite, x * 32, y * 32);
    }

    @Override
    public void receivePlayer() {
        Player.getPlayer().eat();
        System.out.println("You gained 20 health increase!");
    }
}
