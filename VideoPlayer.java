public class VideoPlayer implements MediaPlayer{

    private String videoFile;

    public VideoPlayer(String videoFile) {
        this.videoFile = videoFile;
    }




    @Override
    public void play() {
        System.out.println("Play video: " + videoFile);

    }

    @Override
    public void stop() {
        System.out.println("Stop video: " + videoFile);
    }
}
