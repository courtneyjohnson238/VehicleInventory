public class Vehicle {

    private long id;
    private String model;
    private String color;
    private int  odometer;
    private float price;

    public Vehicle(){
    }

    public Vehicle(long id,String model, String color, int odometer, float price) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public float getReading() {
        return price;
    }

    public void setReading(float reading) {
        this.price = price;
    }
}
