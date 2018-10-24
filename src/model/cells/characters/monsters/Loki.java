package model.cells.characters.monsters;

import javafx.scene.canvas.GraphicsContext;
import model.maze.Maze;

public class Loki extends Monster {



    @Override
    public void move(int x, int y, Maze maze) {
        System.out.println("Loki is moving!");
    }

    @Override
    public void draw(GraphicsContext cell, int x, int y) {
        //cell.drawImage(sprite, x * 32, y * 32);
    }

    @Override
    public void receivePlayer() {
        System.out.println("Loki receiving!");
    }
}
