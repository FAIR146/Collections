package game;

public class Creature {
    private int hp;
    private int hitSize;
    private double lvl = 1;
    private double xp;
    private int startHp;

    public void setStartHp(int startHp) {
        this.startHp = startHp;
    }

    public int getStartHp() {
        return startHp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public double getXp() {
        return xp;
    }

    public void setHp (int hp){
        this.hp= hp;
    }

    public void setHitSize (int hitSize) {
        this.hitSize = hitSize;
    }

    public void setLvl (double lvl) {
        this.lvl = lvl;
    }

    public double getLvl() {
        return lvl;
    }

    public int getHp() {
        return hp;
    }

    public int getHitSize() {
        return hitSize;
    }
    public void hit (Creature creature) {
        int remainingHpAfterHit = creature.getHp() - getHitSize();
        creature.setHp(remainingHpAfterHit);
    }

}
