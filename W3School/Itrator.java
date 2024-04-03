package W3School;

import java.util.ArrayList;
import java.util.Iterator;


public class Itrator {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Skoda");

        Iterator<String> ot = cars.iterator();

        System.out.println(ot.next());
        System.out.println(ot.next());

        while (ot.hasNext()) {
            
        System.out.println(ot.next());
        }


        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(12);
        number.add(8);
        number.add(2);
        number.add(22);

        Iterator<Integer> it = number.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i<10) {
                it.remove();
            }
        }
        System.out.println(number);
    }
}
