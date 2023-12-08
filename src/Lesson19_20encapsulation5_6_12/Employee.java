package Lesson19_20encapsulation5_6_12;

  public class Employee {
    private String name;
    public  int age;
    private String address;
    private int salary;

    public Employee(String name,int age,String address,int salary){
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }
      // геттер возвращает значение соотв.переменной
     public String getName(){
        return name;
     }
     public int getAge(){

        return age;
     }
     public String getAddress(){

        return address;
     }

     public void setName( String name ){
        this.name = name;
     }
     public void setAge( int age){
       if(age>17){
        this.age = age;
     }
       else{
           System.out.println("Employee");}
       }
     public void setAddress( String address){
        this.address = address;
     }
     public void setSalary( int salary){
        this.salary=salary;
     }
     public int getSalary(){
        return salary;
     }
     public String toString(){
        return "Emloyee " + getName() + ": "+ "Age " + getAge() + " , salary " + getSalary()+" , address "+ getAddress();
     }
}
