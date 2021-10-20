package HW1;


public class BicycleRush implements Course {
    private int distance;

    public BicycleRush(int distance) {
        this.distance = distance;
    }

    public void course(Team team) {
        team.rush(distance);
    }
}
