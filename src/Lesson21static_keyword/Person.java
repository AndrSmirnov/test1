package Lesson21static_keyword;


public class Person {

    String name;
    int age;
    static int counter;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        counter++;
    }
    public void canTalk(){
        System.out.println("I can talk ");
    }

    public static void sum() {
        System.out.println(1+2);

    }
}
