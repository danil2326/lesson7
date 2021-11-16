package lesson6;

public class cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(bowl bowl) {
        bowl.decreaseFood(appetite);
        System.out.printf("%s has eat\n", name);
        if (satiety = true) {
            System.out.println(name + " " + "well-fed");
        } else {
            System.out.println(name + " " + "hungry");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }
}
