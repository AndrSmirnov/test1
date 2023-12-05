package HWLesson18;

public class Main {
    //Задача 1
    //Создать класс Student c полями (переменными) имя и возраст.
    //Создать несколько обьектов этого класса. Вывести их на печать
    public static void main(String[] args) {
        Student ivanov = new Student();
        Student petrov = new Student();
        Student sidorov = new Student();


         petrov.name = "Petrov";
         sidorov.name = "Sidorov";
         ivanov.name = "Ivanov";

        ivanov.age = 20;
        petrov.age = 19;
        sidorov.age = 21;

        System.out.println("Name is " + ivanov.name + " ,age is " + ivanov.age);
        System.out.println("name is " + petrov.name + " ,age is " + petrov.age);
        System.out.println("name is " + sidorov.name + " ,age is " + sidorov.age);
        System.out.println();
      //Задача 2
        //Создать класс Rectangle (прямоугольник), содержащий переменные длина и ширина,
        // конструктор и методы для подсчета площади и периметра прямоугольника.
        // В классе Main создать несколько обьектов класса Rectangle и
        // вывести на экран площадь и периметр каждого



        Rectangle rect1 = new Rectangle(4.0,5.0);

        System.out.println("Perimeter of rectangle 1 = " + rect1.perimeterOfRectangle());
        System.out.println("Area of rectangle 1 = " + rect1.areaOfRectangle());

        System.out.println();

        Rectangle rect2 = new Rectangle(8.0,12.0);

        System.out.println("Perimeter of rectangle 2 = " + rect2.perimeterOfRectangle());
        System.out.println("Area of rectangle 2 = " + rect2.areaOfRectangle());


    }
}
