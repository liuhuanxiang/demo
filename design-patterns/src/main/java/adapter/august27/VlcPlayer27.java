package adapter.august27;

public class VlcPlayer27 implements AdvanceMediaPlayer27{
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放vlc文件："+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
