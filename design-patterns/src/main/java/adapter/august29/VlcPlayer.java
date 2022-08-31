package adapter.august29;

public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("播放vlc文件："+fileName);
    }
}
