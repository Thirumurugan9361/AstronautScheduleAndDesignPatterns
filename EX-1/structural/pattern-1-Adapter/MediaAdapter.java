public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedPlayer;
    public MediaAdapter(String type) {
        if(type.equalsIgnoreCase("vlc")) advancedPlayer = new VlcPlayer();
        else if(type.equalsIgnoreCase("mp4")) advancedPlayer = new Mp4Player();
    }
    public void play(String type, String filename) {
        if(type.equalsIgnoreCase("vlc")) advancedPlayer.playVlc(filename);
        else if(type.equalsIgnoreCase("mp4")) advancedPlayer.playMp4(filename);
    }
}