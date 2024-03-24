package JavaBook;

public class StreamingSongTestDrive {
    public static void main(String[] args) {
        StreamingSong song = new StreamingSong();
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
        StreamingSong song2 = new StreamingSong();
        song2.artist = "Suganya";
        song2.title = "Chuchu";
        song2.play();
        song2.printDetails();

    }
}

class StreamingSong {

    String title;
    String artist;
    int duration;

    void play() {
        System.out.println("Playing song");
    }

    void printDetails() {
        System.out.println("This is " + title +
                " by " + artist);
    }
}
