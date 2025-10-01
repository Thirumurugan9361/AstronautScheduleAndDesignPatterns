public class AudioPlayer implements MediaPlayer {
    MediaAdapter adapter;
    public void play(String type, String filename) {
        if(type.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + filename);
        } else if(type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
            adapter = new MediaAdapter(type);
            adapter.play(type, filename);
        } else {
            System.out.println("Invalid media type: " + type);
        }
    }
}