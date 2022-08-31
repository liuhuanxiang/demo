package adapter.august29;

public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        System.out.println("播放mp4文件："+fileName);
    }

    @Override
    public void playVlc(String fileName) {

    }
}
