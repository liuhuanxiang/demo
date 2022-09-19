package adapter.september5;

public class AudioPlayer implements MediaPlayer{

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equals(audioType)) {
            System.out.println("播放mp3文件："+fileName);
        } else if ("mp4".equals(audioType) || "vlc".equals(audioType)) {
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("未适配该文件");
        }
    }
}
