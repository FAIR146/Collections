package game;

import java.util.Scanner;

public class Hero extends Creature{
    public Hero (){
        setHp(200);
        setStartHp(getHp());
        setLvl(1);
        setHitSize(15);
        setXp(0);
    }
}
