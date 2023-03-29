package Necessarily;

public class Animal {
    private String name;
    private int age;
    public  Animal (String name, int age) {
        this.age = age;
        this.name = name;
    }
    public void voice () {
        System.out.println(aboutMe() + " Я издаю звуки");
    }
    public String aboutMe () {
        return "Я " + name + " мой возраст: " + age;
    }
}
