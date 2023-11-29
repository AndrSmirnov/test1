package home_work;
import java.util.Arrays;

public class MainHW29_11 {

    public static void main(String[] args) {
         /*
         Написать метод, принимающий массив целых чисел и проверяющий равна ли сумма
         всех имеющихся там чисел 10 тридцати.
         Метод возвращает false если нет и true если да.
           т.е. для массива 10, 15, 10, 1, 25, 10 -> true
         для массива 10, 15, 10, 1, 25, 45 -> false
         Фактически, в общем виде метод проверяет равна ли сумма всех элементов массива, равных n числу m
          */
        int []array ={10, 15, 10, 1, 25, 10};
        System.out.println(returnElements(array));

    }
    public static boolean returnElements(int[]array){
        int sum = 0;
        boolean res = true;
        for (int i = 0;i < array.length; i++ ){
            if(array [i]==10){
                sum++;
                if (sum == 3){
                 return res;
                }
            }
        }
        return !res;
    }
}