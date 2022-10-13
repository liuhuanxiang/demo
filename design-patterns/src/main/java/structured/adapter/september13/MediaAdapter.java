package structured.adapter.september13;

public class MediaAdapter implements MediaPlayer{

    private AdvancedMediaPlayer player;

    public MediaAdapter(String audioType) {
        if ("mp4".equals(audioType)) {
             player = new Mp4Player();
        } else if ("vlc".equals(audioType)) {
            player = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("mp4".equals(audioType)) {
           player.playMp4(fileName);
        } else if ("vlc".equals(audioType)) {
           player.playVlc(fileName);
        }
    }
}
