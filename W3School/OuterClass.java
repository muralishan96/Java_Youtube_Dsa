package W3School;

public class OuterClass {
    int x =10;

    class InnerClass{
        int y = 20;
    }
}

class Main{
    public static void main(String[] args) {
        OuterClass a = new OuterClass();
        OuterClass.InnerClass c = a.new InnerClass();
        System.out.println(a.x+c.y);
    }
}
