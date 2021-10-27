package HW1;


import HW1.Course;

public class Pool implements Course {
    private int distance;

    public Pool(int distance) {
        this.distance = distance;
    }

    public void course(Team team) {
        team.swim(distance);
    }
}
