package adapter.august29;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {

//        if ("mp4".equalsIgnoreCase(audioType) || "vlc".equalsIgnoreCase(audioType)) {
//            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
//            mediaAdapter.play(audioType, fileName);
//        }
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("播放mp3文件："+fileName);
        } else {
            System.out.println("暂不支持该文件");
        }
    }
}
