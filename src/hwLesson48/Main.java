package hwLesson48;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    /*
    Получить и вывести на экран:
-текущую дату
-текущий год, месяц и день
Создать дату , например день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран текущее время
текущее время + 3 часа
Создать дату на неделю позже сегодняшней
Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
     */
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Today's date: "+today);

        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        System.out.println("year: "+year);
        System.out.println("month: "+month);
        System.out.println("day: "+day);


        LocalDate date = LocalDate.of(1974,7,8);
        System.out.println("Custom date: "+date);


        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2024,1,30);

        if(date1.equals(date2))
            System.out.println("Equal dates");
        else
            System.out.println("Dates are not equal");

        LocalTime time = LocalTime.now();
        System.out.println("Current time is "+time);

        LocalTime newTime = time.plusHours(3);
        System.out.println("Current time plus 3 hours is "+newTime);

        LocalDate newDateWeekAfter = today.minusWeeks(1);
        System.out.println(newDateWeekAfter);

        LocalDate tomorrow = LocalDate.of(2024,1,30);
        LocalDate yesterday = LocalDate.of(2024,1,15 );
        System.out.println("Date after:"+tomorrow);
        System.out.println("Date before: "+yesterday);

    }
}

