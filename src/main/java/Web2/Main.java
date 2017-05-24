package Web2;

import Web.Car;
import Web.Shop;

import java.util.ArrayList;

/**
 * Created by Administrator on 5/5/2017.
 */

//class
public class Main {

    Car car;

    Car [] args = new Car[10]; //massive only 10 cars

    //new - for memory

    static ArrayList <Car> listCars = new ArrayList<Car>();   //array list - null before new initializing

    //method
    public static void main(String[]orgs){

        System.out.println("Car specifications:");
        System.out.println();


        int i=0;
        final Car forester = new Car ("blue", 210L, 45000L, 230L, 1500L, "crossover", "2.5 turbo");
        final Car amg = new Car("black", 350L, 20000L, 520L, 1600L, "sedan", "5.5");
        final Car p911 = new Car ("yellow", 300L, 180000L, 390L, 1400L, "coupe", "3.6");

        listCars = new ArrayList<Car>(){{
            add(forester);
            add(amg);
            add(p911);
        }};

        int size = listCars.size();
//        for (int i=0; i<size; i++){
//            listCars.get(i).printInfa();
//        }

        Shop shop = new Shop();
        shop.setListCars(listCars);
        shop.getByColor("blue").printInfa();
        shop.getByColor("pink").printInfa();

    }
}