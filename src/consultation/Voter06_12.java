package consultation;

public class Voter06_12 {

       private String name;
       private String address;
       private int age;

    public Voter06_12(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        if (age<16)
            System.out.println("The person is too young to vote");
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;

    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address =address;

    }
    public void setAge(int age){
        this.age=age;
        if (age>=16){
    }   else
    {
            System.out.println(name + "  jfdirk  ");
        }
}
      public String toString(){
        return "The voter is " + name+"  ,age "+ age + " ,address " + address;

    }
}
