package HW1;

public class Athlete extends Human implements Team {
    private int maxRun;
    private int maxSwim;
    private int maxRush;


    public Athlete(String name, String gender, int age, int maxRun, int maxSwim, int maxRush) {
        super(name, gender, age);
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxRush = maxRush;


    }


    @Override
    public void rush(int distance) {
if (distance > maxRush) {
    System.out.println("Я " + getName() + " не смог(ла) проехать на велосипеде гонку длинной " + distance + " км.");
} else {
    System.out.println("Я " + getName() + " проехал(ла) на велосипеде гонку длинной " + distance + " км.");
    }
}


    @Override
    public void run(int distance) {
        if (distance > maxRun) {
            System.out.println("Я " + getName() + " не смог(ла) пробежать кросс длинной " + distance + " км.");
        } else {
            System.out.println("Я " + getName() + " пробежал(ла) кросс длинной " + distance + " км.");
        }
    }

    @Override
    public void swim(int distance) {

        if (distance > maxSwim) {
            System.out.println("Я " + getName() + " не смог(ла) проплыть дистанцию длинной " + distance + " м.");
        } else {
            System.out.println("Я " + getName() + " проплыл(а) дистанцию длинной " + distance + " м.");
        }
    }
}
