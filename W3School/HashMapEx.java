package W3School;
import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String,String> city = new HashMap<String , String>();
        city.put("Taminadu", "Chennai");
        city.put("Tamilnadu", "Trichy");
        System.out.println(city);
        System.out.println(city.get("Tamilnadu"));

    }
}
