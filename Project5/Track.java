package Project5;

public class Track {
    private String trackTitle;
    private int minutes;
    private int seconds;
    public Track(String trackTitle, int minutes, int seconds) {
        this.trackTitle = trackTitle;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
}