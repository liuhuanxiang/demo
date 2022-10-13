package structured.adapter.august27;

import cn.hutool.core.util.ObjectUtil;

public class MediaAdapter27 implements MediaPlayer27{

    AdvanceMediaPlayer27 advanceMediaPlayer27;

    public MediaAdapter27(String audioType) {
        if (ObjectUtil.isEmpty(audioType)) {
            return;
        }
        switch (audioType) {
            case "mp4":
                advanceMediaPlayer27 = new Mp4Player27();
                break;
            case "vlc":
                advanceMediaPlayer27 = new VlcPlayer27();
                break;
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (ObjectUtil.isEmpty(audioType)) {
            return;
        }
        switch (audioType) {
            case "mp4":
                advanceMediaPlayer27.playMp4(fileName);
                break;
            case "vlc":
                advanceMediaPlayer27.playVlc(fileName);
                break;
        }
    }
}
