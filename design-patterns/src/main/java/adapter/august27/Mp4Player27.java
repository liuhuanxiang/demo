package adapter.august27;

public class Mp4Player27 implements AdvanceMediaPlayer27{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放mp4文件："+fileName);
    }
}
