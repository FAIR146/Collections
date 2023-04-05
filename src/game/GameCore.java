package game;

import java.util.Scanner;

public class GameCore {
    private final Scanner scanner = new Scanner(System.in);

    public void start () {
        Hero hero = new Hero();
        Enemy enemy = new Enemy();
        System.out.println("Добро пожаловать!");
        System.out.println("Ваше здоровье: " + hero.getHp() + ", Ваш уровень: " + hero.getLvl());
        System.out.println("Для аттаки введите 1");
        System.out.println("Для выхода введите 0");
        while (true) {
            if (scanner.nextInt() == 0) {
                break;
            }

            if (scanner.nextInt() == 1) {
                hero.hit(enemy);
                System.out.println("Здоровье врага: " + enemy.getHp());
            }

            if (enemy.getHp() <= 0) {
                System.out.println("Вы победили врага!");
                upHeroRank(hero);
                upEnemyRank(enemy);
                if (hero.getXp() % 10 == 0) {
                    hero.setLvl(hero.getLvl() + 1.0);
                }
                System.out.println("Ваш уровень " + hero.getLvl());
            } else {
                enemy.hit(hero);
                System.out.println("Ваше здоровье: " + hero.getHp());

            }


            if (hero.getHp() <= 0) {
                System.out.println("Вы погибли, игра закончена");
                break;
            }

        }
    }
    public void upHeroRank (Hero hero) {
        hero.setHp(hero.getStartHp() + 20);
        hero.setXp(hero.getXp() + 1);
    }
    public void upEnemyRank (Enemy enemy) {
        enemy.setHp(enemy.getStartHp() + 10);
        enemy.setXp(enemy.getXp() + 1);
        enemy.setHitSize(enemy.getHitSize() + 5);
    }

}
