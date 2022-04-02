// making an inheritance
public class Cat extends Dog{

    //creating a new Variable in the Cat class
    String cute;

    //creating a constructor to hold all the variables from the dog and the cat classes
    Cat(String cute,double slim,String eat) {
        //making a super statement to send the parameters to the parent class
        super(slim,eat);
        //creating a block of code witch will assign the variable(cute)to the parameter
        this.cute = cute;

    }
}
