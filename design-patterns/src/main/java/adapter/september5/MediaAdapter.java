package adapter.september5;

public class MediaAdapter implements MediaPlayer{

    private AdvancedMediaPlayer player;

    public MediaAdapter(String audioType) {
        if ("mp4".equals(audioType)) {
            player = new Mp4Player();
        }else if ("vlc".equals(audioType)) {
            player = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioTYpe, String fileName) {
        if ("mp4".equals(audioTYpe)) {
            player.playMp4(fileName);
        } else if ("vlc".equals(audioTYpe)) {
            player.playVlc(fileName);
        }
    }
}
