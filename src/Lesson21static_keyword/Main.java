package Lesson21static_keyword;

public class Main {
    //
    // Static означает,что переменная/метод принадлежат самому классу а не объектам класса.Это означает
    //
    public static void main(String[] args) {

        Person person1 = new Person("John",25);
        Person person2 = new Person("Mike",35);

        System.out.println("The number of persons created is  " + Person.counter); //  доступ к статическим переменным
                                                                                   // и методам из других классов
           person1.canTalk();                                                                       //   осущ.через имя класса(PERSON)
           Person.sum();
    }
}
