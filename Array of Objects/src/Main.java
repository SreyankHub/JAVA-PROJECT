public class Main {

    public static void main(String[] args) {

        //making a array of objects
        puchkira[] puchkiras = new puchkira[2];

        //making variable to hold the strings
        puchkira putchki1 = new puchkira("cat");
        puchkira putchki2 = new puchkira("dog");

        //Assigning them to the arraylist
        puchkiras[0] = putchki1;
        puchkiras[1] = putchki2;

        //printing them with a for loop
      for(int i=0;i<puchkiras.length;i++) {
          System.out.println(puchkiras[i].putchkis);
      }


    }
}
