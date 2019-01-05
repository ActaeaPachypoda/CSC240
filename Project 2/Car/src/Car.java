public class Car
{
    private int yearModel;
    private String make;
    private int speed;

    public Car(int yearModel, String make, int speed)
    {
    this.make=make;
    this.speed=speed;
    this.yearModel=yearModel;
    }

    public void accelerate()
    {
        this.setSpeed(this.speed+5);
    }

    public void brake()
    {
        this.setSpeed(this.speed-5);
        if (this.speed <=0)
            this.setSpeed(0);
    }

    public String  getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String toString() {
        return this.make+" "+this.yearModel+"(now ... at speed of "+this.speed;
    }
}
