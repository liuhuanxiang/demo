package adapter.september13;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        System.out.println("播放mp4文件："+fileName);
    }

    @Override
    public void playVlc(String fileName) {

    }
}
