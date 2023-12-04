package consultation;

public class MainKW28_11 {


    public static void main(String[] args) {
       /*
        int[]array ={3,5,5,1,6,8,};
        System.out.println(calcEvenNumbers(array));
      //  System.out.println("Hello");
    }
    public static int calcEvenNumbers(int[]array){
           int counter=0;
        for(int element : array){
            if(element%2==0){
            counter ++;

        }
    }
        return counter ;

        */
        String [] strings ={
                "Hello world",
                "hello world",
                "Jack",
                "Hello John",
                "That's it",
                "John"
        };
          printStringWithLength(strings ,4);
    }
    public static void printStringWithLength(String []array,int length){
        int counter=0;
        for(String str : array){   //for (int i=0;i<array.length;i++)
            if(str.length() == length ){
                System.out.println(str);
                counter++;
            }
        }
        if (counter==0 ){
            System.out.println("нет таких строк ");
    }
    }
}
