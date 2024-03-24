package JavaBook;

public class EpisodeTestDrive {
    public static void main(String[] args) {

        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.skipToNext();
        episode.skipIntro();
    }
}

class Episode {

    int seriesNumber;
    int episodeNumber;

    void skipIntro() {
        System.out.println("Skipping intro...");
    }

    void skipToNext() {
        System.out.println("Loading next episode...");
    }
}