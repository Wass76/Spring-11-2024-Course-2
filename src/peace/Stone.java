package peace;

public class Stone {

    protected String position;
    protected String color;
    protected boolean isAlive;


    public Stone(String position, String color, boolean isAlive){
        this.position = position;
        this.color = color;
        this.isAlive = isAlive;
    }

    public Stone(){
        this("0"," ",true);
    }

//    public Stone(){
//        this.position="0";
//        this.color="0";
//        this.isAlive=true;
//    }



    public String getPosition() {
        System.out.println("parent Position: " + position);
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getColor() {
        System.out.println("parent color is " + color);
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected void start(){
        System.out.println("parent starting");
    }

    @Override
    public String toString() {
        return "Stone{" +
                "position='" + position + '\'' +
                ", color='" + color + '\'' +
                ", isAlive=" + isAlive +
                '}';
    }
}
