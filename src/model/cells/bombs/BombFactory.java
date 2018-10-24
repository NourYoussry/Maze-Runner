package model.cells.bombs;

public class BombFactory {

    public Bomb getBomb (char selector) {

        switch (selector) {

            case 'f':
                return new FireBomb();

            case 'b':
                return new FreezeBomb();

        }

        return null;
    }

}
