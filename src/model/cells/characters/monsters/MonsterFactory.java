package model.cells.characters.monsters;

import model.cells.gifts.AmmoGift;
import model.cells.gifts.ArmorGift;
import model.cells.gifts.HealthGift;

public class MonsterFactory {

    public Monster getMonster (char selector) {

        switch (selector) {

            case 'z':
                return new Loki();

            case 'x':
                return new Tumor();

        }

        return null;
    }

}
