package HWLesson19;
            // Задача 1
            //Создать класс Temperature (температура), содержащий метод для перевода градусов
            // по фаренгейту в градусы цельсия ( celsius = 5*(farenheit - 32)/9).
            // В классе Main создать несколько обьектов класса Temperature
           // (значение температуры по фаренгейту должно задаваться через конструктор)
           //и вывести результат перевода на экран
public class Main19_12 {

    public static void main(String[] args) {

        Temperatur temperatur1 = new Temperatur (0.0,50);
        System.out.println("Temperatur is: " + temperatur1.TempCelcius());

        System.out.println();

        Temperatur temperatur2 = new Temperatur (0.0,100);
        System.out.println("Temperatur is: " + temperatur2.TempCelcius());

    }
}
