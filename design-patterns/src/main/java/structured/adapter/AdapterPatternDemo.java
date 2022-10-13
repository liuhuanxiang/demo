package structured.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "认真的雪.mp3");
        audioPlayer.play("vlc", "认真的雪.vlc");
        audioPlayer.play("mp4", "认真的雪.mp4");
        audioPlayer.play("mp5", "认真的雪.mp5");
    }
}
