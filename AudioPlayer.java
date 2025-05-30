public class AudioPlayer implements MediaPlayer {

    private String audioFile;

    public AudioPlayer(String audioFile) {
        this.audioFile = audioFile;
    }

    @Override
    public void play() {
        System.out.println("Play audio: " + audioFile);

    }

    @Override
    public void stop() {
        System.out.println("Stop audio: " + audioFile);
    }
}
