package adapter.september13;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("播放vlc文件："+fileName);
    }
}
