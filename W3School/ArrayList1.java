package W3School;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> Alist = new ArrayList();
        Alist.add("Volvo");
        Alist.add("MBD");
        System.out.println(Alist);
        System.out.println(Alist.get(0));
        Alist.set(0, "hi");
        System.out.println(Alist.get(0));

        //cars.remove(0);
        //cars.clear();
        //cars.size();
        
    }
}
