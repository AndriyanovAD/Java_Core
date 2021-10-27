package HW1;


public class Human {
    private String name;
    private String gender;
    private int age;

    public Human (String name, String gender, int age) {
        this.name = name;
        if (gender == "мужчина" || gender == "женщина") this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Человек" +
                " по имени " + name + '\'' +
                ", пол - " + gender + '\'' +
                ", возраст - " + age +
                "лет";
    }

    public String getName() {
        return name;
    }
}
