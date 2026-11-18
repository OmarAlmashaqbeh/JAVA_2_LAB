package Project5;

public class CD {
    private String artist;
    private String cdTitle;
    Track[] tracks;
    private int current;

    public CD(String artist, String cdTitle, int numOfTracks) {
        this.artist = artist;
        this.cdTitle = cdTitle;
        tracks = new Track[numOfTracks];
        current = 0;
    }

    void addTrack(Track track) {
        if (current < tracks.length) {
            tracks[current] = track;
            current++;
        } else {
            System.out.println("Cannot add more tracks. The CD is full.");
        }
    }

    int getTotalSeconds() {
        int totalSeconds = 0;
        for (int i = 0; i < tracks.length; i++) {
            totalSeconds += tracks[i].getSeconds();
            totalSeconds += 60 * tracks[i].getMinutes();
        }
        return totalSeconds;
    }

    void printTotalTime() {
        int totalSeconds = getTotalSeconds();
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        System.out.println(minutes + ":" + seconds);
    }
}