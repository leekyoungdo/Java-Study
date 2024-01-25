package _05_class._06_interface;

public class mp3Player implements MusicPlayer {

    private String musicName;

    @Override
    public void play() {
        System.out.println("MP3 플레이어에서 " + FIRST_MUSIC + " 음악을 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("MP3 플레이어에서 " + FIRST_MUSIC + " 음악을 정지합니다.");
    }

    @Override
    public void musicName(String name) {
        System.out.println("현재 재생곡" + musicName );
    }
}
