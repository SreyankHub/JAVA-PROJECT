public class Main {

    public static void main(String[] args) {
        // making the class Objects
        Cat cat = new Cat("very cute",80,"Fish");
        Dog dog = new Dog(50,"Bones");


        // printing the variables inside the class(Cat)
        System.out.println(cat.cute);
        System.out.println(cat.slim);
        System.out.println(cat.eat);

        System.out.println("\n");

        // printing the variables inside the class(Dog)
        System.out.println(dog.eat);
        System.out.println(dog.slim);
    }
}
