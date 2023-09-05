public class Fan {
    String manufacturer,category;
    int speed, maxSpeed;
    boolean isON;

    public Fan(String manufacturer,String category,int maxSpeed){
        this.manufacturer = manufacturer;
        this.category = category;
        this.maxSpeed = maxSpeed;
    }
    public void turnOn(int fanSpeed){
        isON = true;
        if(fanSpeed<=maxSpeed){
            speed = fanSpeed;
        }else{
            speed = maxSpeed;
        }
        System.out.println("Speed: " + speed);
    }
    public void increaseSpeed(int amt){
        if((speed+amt)<=maxSpeed) speed += amt;
        else speed = maxSpeed;
        System.out.println("increseSpeed: " + speed);
    }
    public void decreaseSpeed(int amt){
        if(speed<=maxSpeed) speed -= amt;
        else speed = maxSpeed;
        System.out.println("decreseSpeed" + speed);
    }
    public void display(){
        System.out.println("category: " + category);
        System.out.println("Manufaturer: " + manufacturer);
        System.out.println("maxspeed: " + maxSpeed);
    }
}
