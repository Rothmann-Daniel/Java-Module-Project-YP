public class Car {
   private String name;
   private int speed;

    Car (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    public String getName(){
        return name;
    }
}
