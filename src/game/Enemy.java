package game;

public class Enemy extends Creature {

    public Enemy () {
        setHp(50);
        setStartHp(getHp());
        setLvl(1);
        setXp(10);
        setHitSize(5);
    }
}
