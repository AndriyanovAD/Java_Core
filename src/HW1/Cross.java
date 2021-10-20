package HW1;

import HW1.Course;

public class Cross implements Course {
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    public void course(Team team) {
        team.run(distance);
    }
}
