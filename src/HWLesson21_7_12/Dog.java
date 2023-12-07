package HWLesson21_7_12;

public class Dog {
    String name;
    int age;
    static int counter;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }
}