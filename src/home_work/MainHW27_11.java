package home_work;

public class MainHW27_11 {
    public static void main(String[] args) {
        int[] nums = {2,3,8,44};
     //   System.out.println(findMin(int) );
    /*
    Задача1
         -Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
      -Вывести созданный массив на экран используя цикл for.
      -Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому
       элементу значение Kiwi)
       -Вывести измененный массив на экран используя цикл for.
       Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.
     */
        System.out.println("Print fruits : " );
        String[] fruits = {"Orange","Apple","Banana","Mango"};

        for(int i = 0; i < fruits.length; i++){
            System.out.println("namFruits[" + i + "] = " + fruits[i]);
        }
        fruits[1] = "Kiwi";
             System.out.println("with Kiwi");
        for(int i = 0; i < fruits.length; i++){
               System.out.println(fruits[i]);
            System.out.println("namFruits[" + i + "] = " + fruits[i]);
        }
        /*
        Задача2
            Используя цикл for вывести на экран все четные элементы массива
            fruits из первой задачи.
            Задание можно выполнить непосредственно в методе main
            либо создать отдельный метод.
         */
        for(int i = 0; i < fruits.length; i+=2) {
            System.out.println(fruits[i]);
            System.out.println("namFruits[" + i + "] = " + fruits[i]);
        }

    }
        public static int findMin(int[] ints){
            int min = ints[0];

            for(int i = 1;i < ints.length ; i++){
                if(ints[i] < min){
                    min = ints[i];
                }
            }
            return min;
        }

}
