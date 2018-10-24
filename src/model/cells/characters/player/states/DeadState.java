package model.cells.characters.player.states;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import model.cells.CellState;
import model.maze.Maze;

public class DeadState extends PlayerState implements CellState {

    /* The characterPath is the location of the character image on drive. */
    private String characterPath;

    /* The sprite holds the character image after loading. */
    private Image sprite;

    public DeadState() {

        /* Initialize instance variables. */
        this.characterPath = "view/resources/tomb.PNG";
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
        System.out.println("Dead men can't move!");
    }
}
