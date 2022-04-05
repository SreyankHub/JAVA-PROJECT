public class User {

    //encapsulating the Variables
     private final String password;
     private final double Money;

     //creating a Constructor to Take In The User Password and Money
     User(String password,double Money) {
         //Assigning the Private Variables to the parameters
         this.password = password;
         this.Money = Money;
     }
     //creating a Method to return the Assigned Variables
     String getpassword() {
        return this.password;
    }
    //same with this.money
    double getMoney() {
        return this.Money;
    }
}
