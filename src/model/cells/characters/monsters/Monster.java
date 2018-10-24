package model.cells.characters.monsters;

import model.cells.characters.Character;
import model.maze.Maze;

public abstract class Monster implements Character {

    public abstract void move(int x, int y, Maze maze);

}
