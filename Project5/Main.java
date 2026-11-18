package Project5;

public class Main {
    public static void main(String[] args) {
        CD myCD = new CD("Quran", "Affasi", 3);

        Track t1 = new Track("doha", 3, 20);
        Track t2 = new Track("zalzala", 4, 15);
        Track t3 = new Track("nas", 1, 2);

        myCD.addTrack(t1);
        myCD.addTrack(t2);
        myCD.addTrack(t3);

        System.out.print("Total length of the CD: ");
        myCD.printTotalTime();
    }
}