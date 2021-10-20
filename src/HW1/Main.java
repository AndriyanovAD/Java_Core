package HW1;

import HW1.Athlete;
import HW1.BicycleRush;
import HW1.Course;
import HW1.Cross;

public class Main {

    public static void main(String[] args) {

        Athlete ath1 = new Athlete("Сергей", "мужчина", 25, 10, 500, 20);
        Athlete ath2 = new Athlete("Анна", "женщина", 20, 7, 500, 30);
        Athlete ath3 = new Athlete("Андрей", "слон", 20, 5, 300, 10);
        Athlete ath4 = new Athlete("Ольга", "женщина", 26, 15, 700, 10);


        Team[] teams= {ath1, ath2, ath3, ath4};

        Course[] courseline = {new Cross(7), new Pool(300), new BicycleRush(20)};

        for (Team team : teams){
                for (Course course : courseline){
                    course.course(team);
                 }
        }

    }
}
