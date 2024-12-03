package peace;

public class Castle extends Stone{
    @Override
    public void move(int x) {
        System.out.println("castle moving");
    }

    @Override
    public void move(double x) {
        System.out.println("castle moving");
    }
    @Override
    public void move(){
        System.out.println("castle moving");
    }




    @Override
    public String toString() {
        return "Castle{" +
                "position='" + position + '\'' +
                ", color='" + color + '\'' +
                ", isAlive=" + isAlive +
                '}';
    }
}
