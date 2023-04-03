package game;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Enemy enemy = new Enemy();
        System.out.println(enemy.getHp());
        hero.hit(enemy);
        System.out.println(enemy.getHp());
    }

}
