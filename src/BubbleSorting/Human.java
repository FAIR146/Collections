package BubbleSorting;

public class Human {
    private String name;
    private int weight;
    private int height;

    public Human(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    public void setWeight (int weight) {
        this.weight = weight;
    }
    public void setHeight (int height) {
        this.height = height;
    }
    public String getName () {
        return name;
    }
    public int getWeight () {
        return weight;
    }
    public int getHeight () {
        return height;
    }

    public String toString() {
        return getName() + " " + getHeight() + " " + getWeight();
    }
}
