public class Main {

    public static void main(String[] args) {

        Level level1 = new Level(500);
        Level level2 = new Level(20);

        level2.copy(level1);

        System.out.println(level2.getLevel());



    }
}