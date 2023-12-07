package trucksLesson20_21_7_12;

import java.util.Arrays;

public class Main {
    /*
    создать класс грузовик Truck,содержащий общие характеристики грузовиков:
    model,manufacturer,year(год выпуска),color,maxWeight(грузоподъёмность),
    maxFuel(объём топливного бака),имя владельца
    и имеющий следующее поведение:

    1. должен уметь загружаться(load) и при этом сообщать,если превышена его грузоподъёмность,
    а также сообщать сколько ещё можно загрузить груза
    2. разгружаться и при этом сообщать в случае если пытаются разгрузить больше чем имеющийся у него на борту груз
    или пытаются разгрузить отрицательный груз.Также должен сообщать вес остающегося на борту груза.
    3. В случае отсутствия топлива или груза,соощать о невозможности ехать.
    3a.Должен уметь ездить и останавливаться
    4. уметь заправляться топливом
    5. уметь сообщать имя владельца

    Создать несколько грузовиков,протестировать их работу,сложить в МАССИВ и вывести на экран
            */
    public static void main(String[] args) {
                      Truck truck = new Truck("SuperTruck",
                                            "Volvo",
                                                  2020,
                                              "BlackRed,",
                                              5000,
                                                   500,
                                            "John Smith");
        System.out.println(truck);
        truck.load(1500);
        truck.load(10000);
        truck.load(3500);

        truck.move();
        truck.setCurrentFuel(600);

        truck.move();

        truck.stop();
        truck.unload(10000);
        truck.unload(2000);
        truck.unload(-1000);
        truck.unload(3000);

        Truck truck1 = new Truck("SuperTruck1","MAN",2018, "black-yellow",
                10000,400,"Bill Voit");

        Truck[] trucks = {truck,truck1};
        System.out.println(Arrays.toString(trucks));
        System.out.println();

        for (Truck tr : trucks){
           System.out.println("truck" + tr.getManufacturer() + " : " + tr.getOwner());}
        }}





