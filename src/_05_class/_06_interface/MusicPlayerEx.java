package _05_class._06_interface;

public class MusicPlayerEx {
    public static void main(String[] args) {

        MusicPlayer rc;

        rc = new mp3Player();
        System.out.println("==== MP3 Player ====");
        rc.play();
        rc.stop();

        rc = new CdPlayer();
        System.out.println("==== CD Player ====");
        rc.play();
        rc.stop();
    }
}
