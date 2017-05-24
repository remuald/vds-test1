package Web;

/**
 * Created by Administrator on 5/5/2017.
 */
public class Car {


    public String color;
    public Long speed;
    public Long price;
    public Long power;
    public Long weight;
    public String bodytype;
    public String engine;

    public Car(String color, Long speed, Long price, Long power, Long weight, String bodytype, String engine) { //конструктор с параметрами
        this.color = color;
        this.speed = speed;
        this.price = price;
        this.power = power;
        this.weight = weight;
        this.bodytype = bodytype;
        this.engine = engine;
    }

    public Car() {
    }

    public String color() {
        return color;
    }

    public void setColor(String newcolor) {
        color = newcolor;
    }

    public Long speed() {
        return speed;
    }

    public void setSpeed(Long newspeed) {
        speed = newspeed;
    }

    public Long price() {
        return price;
    }

    public void setPrice(Long newprice) {
        price = newprice;
    }

    public Long power() {
        return power;
    }

    public void setPower(Long newpower) {
        power = newpower;
    }

    public Long weight() {
        return weight;
    }

    public void setWeight(Long newweight) {
        weight = newweight;
    }

    public String bodytype() {
        return bodytype;
    }

    public void setBodytype(String newbodytype) {
        bodytype = newbodytype;
    }

    public String engine() {
        return engine;
    }

    public void setEngine(String newengine) {
        engine = newengine;
    }

    public void printInfa() {
        System.out.println("Color - " + color + ", speed - " + speed);
    }
}
