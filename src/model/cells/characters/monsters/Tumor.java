package model.cells.characters.monsters;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import model.maze.Maze;

public class Tumor extends Monster {

    Image sprite = new Image("view/resources/orc.png");

    @Override
    public void move(int x, int y, Maze maze) {
        System.out.println("Tumor is moving!");
    }

    @Override
    public void draw(GraphicsContext cell, int x, int y) {
        cell.drawImage(sprite, x * 32, y * 32);
    }

    @Override
    public void receivePlayer() {
        System.out.println("Tumor receiving!");
    }
}
