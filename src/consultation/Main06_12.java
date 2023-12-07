package consultation;

public class Main06_12 {
      public static void main(String[] args) {


            Voter06_12 jack = new Voter06_12("Jack", "Street1", 12);
            Voter06_12 ann = new Voter06_12("Ann","srg",25);
          //  ann.setAge(5);
          //  System.out.println(ann);

            Voter06_12[]voters = {jack,ann};

            for( Voter06_12 voter : voters ){
                  System.out.println(voter);
            }
      }
}
