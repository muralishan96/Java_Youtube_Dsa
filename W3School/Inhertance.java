package W3School;

public class Inhertance {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}

/**
 * Car extends Inhertance
 */
 class Car extends Inhertance {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car obj = new Car();
        obj.honk();
        System.out.println(obj.brand+" "+ obj.modelName);
    }
}
