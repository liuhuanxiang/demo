package structured.adapter.august29;

public class Test {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "离开我的依赖.mp3");
        audioPlayer.play("mp4", "离开我的依赖.mp4");
        audioPlayer.play("mp5", "离开我的依赖.mp5");
        audioPlayer.play("vlc", "离开我的依赖.vlc");
        audioPlayer.play("mkv", "离开我的依赖.mkv");
        audioPlayer.play("ipg", "离开我的依赖.ipg");
    }
}
