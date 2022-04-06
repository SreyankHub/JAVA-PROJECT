public class Level {
    private int level;
    Level(int level) {
        this.level = level;
    }

    int getLevel() {
        return this.level;
    }

    void setLevel(int level) {
        this.level = level;
    }

    //copying a value to the other object
    void copy(Level level) {
        this.setLevel(level.getLevel());

    }


}
