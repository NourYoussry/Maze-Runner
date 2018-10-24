package model.save;

import controller.GameScene;
import model.cells.Cell;
import model.maze.Maze;
import model.maze.MazeLoader;
import model.maze.generator.Grid;

public class Originator {

    private int rows, columns;
    private GameScene gameScene;
    private Cell[][] memoState;

    public Memento createMemento(){

        Memento memento =new Memento();
        gameScene = new GameScene();
        if(gameScene.getMazeMatrix() == null)
            System.out.println("inside originator : null maze in game scene");
        else
            System.out.println("inside originator : matrix not null");
        memento.setMemoMaze(gameScene.getMazeMatrix());
        return memento;
    }

    public void getMementoState(Cell[][] game){

        for(int i = 0; i<game.length; ++i)
            for(int j = 0 ; j<game[i].length; ++j){
                this.memoState[i][j] = game[i][j];
            }

    }

}
