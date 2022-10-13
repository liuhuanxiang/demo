package structured.adapter.september13;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {

        if ("mp4".equals(audioType) || "vlc".equals(audioType)) {
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else if ("mp3".equals(audioType)) {
            System.out.println("播放mp3文件："+fileName);
        } else {
            System.out.println("暂未支持！！");
        }
    }

}
