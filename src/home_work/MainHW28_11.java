package home_work;

public class MainHW28_11 {
    public static void main(String[] args) {
          //  написать метод,проверяющий равенство двух массивов целых чисел.В случае если массивы равны,
          //  метод возвращает  true  , если нет то  false .Массивы равны,если они одинаковые

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 6, 4};

        System.out.println(areEqual(array1, array2) ? " Equal " : " Not equal");

    }

    public static boolean areEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;

    }

                 //Есть массив целых чисел. Написать метод, находящий и
                 // возвращающий количество четных чисел в этом массиве.
                  // Пример: {1, 2, 8, 7} -> количество четных чисел = 2.
    {
    int[] array = {3, 5, 5, 1, 6, 8, 3, 7};

        System.out.println(calcEvenNumbers(array));}

    public static int calcEvenNumbers(int[] array){
        int counter=0;
        for(int element : array){
            if (element%2==0){
                counter++;
            };
        }
        return counter;
    }

}
