package structured.adapter.august27;

public class AudioPlayer27 implements MediaPlayer27{

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("播放mp3文件"+fileName);
        } else {
            MediaAdapter27 mediaAdapter27 = new MediaAdapter27(audioType);
            mediaAdapter27.play(audioType, fileName);
        }
    }

}
