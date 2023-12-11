package hwLesson23_11_12;

public class Calculator {
    /*Задача 1
        Создать класс Calculator, способный выполнять два арифметических действия - сложение двух чисел,
        вычитание двух чисел а также сложение трех чисел и вычитание трех чисел.
        Калькулятор должен работать как для целых чисел, так и для чисел с запятой. (т.е
         в классе надо создать соответствующие методы и затем вызывать их в методе main)
*/
    public float result (float x,float y){
        System.out.println(x + " + " + y + " = ");
        return x+y;
    }
    public float result1 ( float x,float y,float z){
        System.out.println(x + " + " + y + " + " + z + " =");
        return x+y+z;
    }public float result2 (float x,float y){
        System.out.println(x + " - " + y + " = ");
        return x-y;
    }
    public float result3 ( float x,float y,float z){
        System.out.println(x + " - " + y + " - " + z + " = ");
        return x-y-z;
    }

}
