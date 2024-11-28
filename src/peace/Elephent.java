package peace;

public class Elephent extends Stone{

    private int age;
    private String color;




    public Elephent(){
        super("","",true);
        age=0;
    }

//    public Elephent(String position,String color,boolean isAlive,int age){
//        super();
//        this.position=position;
//        this.color=color;
//        this.isAlive=isAlive;
//        this.age=age;
//    }
    public Elephent(String position,String color,boolean isAlive,int age){
        super(position,color,isAlive);
//        this.color=color;
        this.age=age;
    }



    public String getColor() {
        System.out.println("child " + color);
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move(String position) {

    }


    public void parentsColor(){
        System.out.println(super.color);
    }






    @Override
    public String toString() {
        return "Elephent{" +
                "age=" + age +
                ", position='" + position + '\'' +
                ", color='" + color + '\'' +
                ", isAlive=" + isAlive +
                '}';
    }
}
