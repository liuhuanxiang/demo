package structured.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("播放vlc"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
