package Necessarily;

public class Dog extends Animal{ // Полиморфизм
    public Dog (String name, int age) {
        super(name, age);
    }
    @Override // преобразование типов от родительского к дочернему
    public void voice () {
        System.out.println(aboutMe() + " я издаю звуки гав-гав");
    }
}
