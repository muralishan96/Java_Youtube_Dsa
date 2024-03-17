package JavaBook;

import java.util.Random;

public class ex2 {
     public static void main(String[] args) {
        String[] wordListOne = {"agnostic", "opinionated",
        "voice activated", "haptically driven", "extensible",
        "reactive", "agent based", "functional", "AI enabled",
        "strongly typed"};
        
          String[] wordListTwo = {"loosely coupled", "six sigma",
        "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless",
        "microservices", "distributed ledger"};
        
          String[] wordListThree = {"framework", "library",
         "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design",
         "orientation"};
        
        int firstLength = wordListOne.length;
        int seocndLength = wordListTwo.length;
        int thirdLength = wordListThree.length;
        System.out.println("First Length "+firstLength);
        System.out.println("Second Length "+seocndLength);
        System.out.println("Third Length "+thirdLength);

        Random randomGenorator = new Random();
        int firstRandom = randomGenorator.nextInt(firstLength);
        int seondRandom = randomGenorator.nextInt(seocndLength),thirdRandom =
        randomGenorator.nextInt(thirdLength);
        System.out.println("firstRandom "+firstRandom);
        System.out.println("seondRadom "+seondRandom);
        System.out.println("thirdRndom "+thirdRandom);

        String Phrase = wordListOne[firstRandom]+" "+wordListTwo[seondRandom]+" "+wordListThree[thirdRandom];
        System.out.println("What we need as "+Phrase);





     }
}
