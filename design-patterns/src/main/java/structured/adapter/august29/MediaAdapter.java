//package adapter.august29;
//
//public class MediaAdapter implements MediaPlayer{
//
//    private AdvanceMediaPlayer advanceMediaPlayer;
//
//    @Override
//    public void play(String audioType, String fileName) {
//        if ("mp4".equalsIgnoreCase(audioType)) {
//            advanceMediaPlayer.playMp4(fileName);
//        } else if ("vlc".equalsIgnoreCase(audioType)) {
//            advanceMediaPlayer.playVlc(fileName);
//        }
//    }
//
//    public MediaAdapter(String audioType){
//        if ("mp4".equalsIgnoreCase(audioType)) {
//            advanceMediaPlayer = new Mp4Player();
//        } else if ("vlc".equalsIgnoreCase(audioType)) {
//            advanceMediaPlayer = new VlcPlayer();
//        }
//    }
//}
