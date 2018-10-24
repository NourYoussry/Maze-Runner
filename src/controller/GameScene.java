package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import model.cells.Cell;
import model.infopanel.InfoPanel;
import model.maze.Maze;
import model.cells.characters.player.Player;
import model.save.Memento;
import model.save.Originator;
import model.save.SaveNLoad;

import java.net.URL;
import java.util.ResourceBundle;

public class GameScene implements Initializable
{

    public Label HealthLBL;
    public Label ScoreLBL;
    public Label TimeLBL;
    public Label AmmoLBL;

    public Button SaveBTN;
    public Button PauseBTN;
    @FXML
    private Canvas CanvasMaze;

    public final static int BOMBS = 5;
    public final static int GRASS_WALLS = 15;
    public final static int GIFTS = 3;
    private final static int ROWS = 41;
    private final static int COLUMNS = 21;

    private Player player;
    private Maze maze;

    private boolean pause = false;

<<<<<<< HEAD
    Image PlayImage = new Image(getClass().getResourceAsStream("../view/UIKit/PlayIcon.png"));
    Image PauseImage = new Image(getClass().getResourceAsStream("../view/UIKit/PauseIcon.png"));
=======
        InfoPanel infoPanel = InfoPanel.getInfoPanel();
        infoPanel.setCanvas(CanvasMaze);
        infoPanel.drawPanel();

    }
>>>>>>> 279bda8cd752aabe460cd4dd9004982379ab8d54

    public Memento createMemento(){

        Memento memento =new Memento();
        memento.setMemoMaze(this.getMazeMatrix());
        return memento;
    }

    public void getMementoState(Cell[][] game){

        for(int i = 0; i<game.length; ++i)
            for(int j = 0 ; j<game[i].length; ++j)
                this.getMazeMatrix()[i][j] = game[i][j];

    }

    public Cell[][] getMazeMatrix(){
        // returns a reference to the matrix of cells
        return this.maze.getMaze();
    }

    public void keyPress(KeyEvent keyEvent) {

        /*test save*/
        if(keyEvent.getCode() == KeyCode.N){

            SaveNLoad save = new SaveNLoad();
            save.addGameMemo(this.createMemento());
            save.serializeGamesList();



        }
        /*end of test*/

        /* If the player wants to move upwards. */
        if (keyEvent.getCode() == KeyCode.W) {
            player.move(0, -1, maze);
        }

        /* If the player wants to move downwards. */
        if(keyEvent.getCode() == KeyCode.S){
            player.move(0, 1, maze);
        }

        /* If the player wants to move leftwards. */
        if(keyEvent.getCode() == KeyCode.A) {
            player.move(-1, 0, maze);
        }

        /* If the player wants to move rightwards. */
        if(keyEvent.getCode() == KeyCode.D){
            player.move(1, 0, maze);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        /* Generate a new maze with the given dimensions. */
        maze = new Maze(ROWS, COLUMNS);

        /* Draw the initial state of the maze. */
        maze.drawMaze(CanvasMaze);

        /* Get a reference to the player singleton. */
        player = Player.getPlayer();

        /* Set focus on the canvas. */
        CanvasMaze.setFocusTraversable(true);

<<<<<<< HEAD


        PauseBTN.setGraphic(new ImageView(PauseImage));
=======
>>>>>>> 279bda8cd752aabe460cd4dd9004982379ab8d54
    }

    public void BTNs_Action(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == SaveBTN) {
            //Save Data
        }

        if (actionEvent.getSource() == PauseBTN) {
            if (pause) {
                PauseBTN.setGraphic(new ImageView(PauseImage));
                pause = false;
            }
            else {
                PauseBTN.setGraphic(new ImageView(PlayImage));
                pause = true;
            }
        }
    }
}
