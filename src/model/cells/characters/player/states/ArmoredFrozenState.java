package model.cells.characters.player.states;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import model.cells.Cell;
import model.cells.CellState;
import model.cells.characters.player.Player;
import model.cells.walls.Wall;
import model.maze.Maze;

public class ArmoredFrozenState extends PlayerState implements CellState  {

    private static int frozenCounter = 3;

    /* The characterPath is the location of the character image on drive. */
    private String characterPath;

    /* The sprite holds the character image after loading. */
    private Image sprite;

    public ArmoredFrozenState() {

        /* Initialize instance variables. */
        this.characterPath = "view/resources/FreezedArmoredHero.PNG";
        this.sprite = new Image(characterPath);
    }

    @Override
    public void draw(GraphicsContext cell, int x, int y) {
        cell.drawImage(sprite, x * 32, y * 32);
    }

    @Override
    public void receivePlayer() {

    }

    @Override
    public void hit() {

    }

    @Override
    public void move(int x, int y, Maze maze) {

        if (frozenCounter > 1) {
            frozenCounter--;
        } else {
            Player.getPlayer().setPlayerState(new ArmoredState());
        }

    }
}
