package Necessarily;

public class Cow extends Animal{ // Полиморфизм
    public Cow(int age, String name) {
        super(name, age);
    }
    @Override // преобразование типов от родительского к дочернему
    public void voice () {
        System.out.println(aboutMe() + " я издаю звуки му-му");
    }
}
