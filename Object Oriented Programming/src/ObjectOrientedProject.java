public class ObjectOrientedProject {

    public static void main(String[] args) {

        Family family = new Family();

        System.out.println(family.Brother);
        System.out.println(family.Sister);
        System.out.println(family.Mom);
        System.out.println(family.Dad);
        System.out.println(family.Location);
    }
}

 class Family {

    String Mom = "Ria Bose Bhattacharjee";
    String Dad = "Sujay Kumar Bose";
    String Sister = "Sreyanshi Bose";
    String Brother = "Sreyank Bose";

    String Location = "Kolkata";

}
