package Web;

import java.util.ArrayList;

/**
 * Created by Administrator on 5/23/2017.
 */
public class Shop {
    ArrayList<Car> listCars;

    public ArrayList<Car> getListCars() {
        return listCars;
    }

    public void setListCars(ArrayList<Car> listCars) {
        this.listCars = listCars;
    }

    public Car getByColor(String color) {
        for (int i = 0; i < listCars.size(); i++) {
            Car car = listCars.get(i);
            String actualColor = car.color();
            if (actualColor.equals(color)) {
                return car;
            }
        }
        return new Car();
    }
}
