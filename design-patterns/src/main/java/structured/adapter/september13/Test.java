package structured.adapter.september13;

public class Test {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "天涯.mp3");
        player.play("mp4", "天涯.mp4");
        player.play("vlc", "天涯.vlc");
        player.play("mp5", "天涯.vlc");
    }
}
