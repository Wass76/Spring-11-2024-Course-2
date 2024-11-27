package peace;

public class Elephent {

    private String position;
    private String color;
    private boolean isAlive;


    public Elephent(String position, String color, boolean isAlive) {
        this.position = position;
        this.color = color;
        this.isAlive = isAlive;
    }

    public String getPosition() {
        return position;
    }

    public String getColor() {
        return color;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void move(){
    }

    @Override
    public String toString() {
        return "Elephent{" +
                "position='" + position + '\'' +
                ", color='" + color + '\'' +
                ", isAlive=" + isAlive +
                '}';
    }
}
