package Lesson19_20encapsulation5_6_12;

public class Main {
    /*
     Инкапсуляция - означает соединение переменных и методов в классе,
     фактически создавая класс мы уже используем инкапсуляцию.
     Идея заключается в том, чтобы скрыть детали реализации от пользователей.
     Для того чтобы осуществить это-нужно:
     1. Сделать переменные приватными так чтобы к ним не было прямого доступа снаружи класса.
     2. Использовать для доступа к ним спец. методы,так называемые геттеры и сеттеры
          Модификаторы доступа:

        1. default -  по умолчанию, т.е когда мы не указываем никакой модификатор. Область видимости  переменной/ метода
       в этом случае ограничивается пакетом, в котором находится класс, содержащий эту переменную/метод

      2. public -  переменная/метод с таким модификатором видны везде

      3. private -  переменная/метод видны только в том классе, в котором они созданы

      4. protected

      Getters and Setters-  геттеры и сеттеры это методы, позволяющие защитить данные и таким образом
      сделать код более безопасным

      геттер - это метод, возвращающий значение соответствующего поля. Для удобства восприятия геттер
      начинается со слова get за которым следует название переменной

       Сеттер - это метод,который устанавливает новое значение соответствующей переменной.
       начинается со слова   set   за которым следует наз. переменной
     */
    public static void main(String[] args) {
        Employee employee1 =new Employee("John ",45,"Street1", 5000);

        /*    System.out.println(employee1.name + ":");
            System.out.println("Age "+ employee1.age);
            System.out.println("Address "+ employee1.address);
            System.out.println("Salary "+ employee1.salary);

            employee1.

         */
        System.out.println("Employee " + employee1.getName());
        System.out.println("Age "+ employee1.getAge());
        System.out.println("Address "+ employee1.getAddress());
        System.out.println("Salary "+ employee1.getSalary());
        System.out.println();

        employee1.setAge(50);
        employee1.setAddress("Street2");

        System.out.println("Employee " + employee1.getName());
        System.out.println("Age "+ employee1.getAge());
        System.out.println("Address "+ employee1.getAddress());
        System.out.println("Salary "+ employee1.getSalary());

        System.out.println(employee1);
        System.out.println();

        System.out.println("Another emloyee ");
        Employee kate = new Employee("Kate",25,"Street3",4500);
        System.out.println(kate);

    }
}