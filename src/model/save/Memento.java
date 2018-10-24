package model.save;

import model.cells.Cell;
import model.maze.Maze;

public class Memento {

    private Cell[][] memoMaze;

    public Cell[][] getMemoMaze() {
        return memoMaze;
    }

/*    public void setMemoMaze(Cell[][] memoMaze) {
        for(int i = 0; i<memoMaze.length; ++i)
            for(int j = 0 ; j<memoMaze[i].length; ++j){
                this.memoMaze[i][j] = memoMaze[i][j];
            }
    }*/
    public void setMemoMaze(Cell[][] memoMaze) {
        this.memoMaze = memoMaze;
}
}
