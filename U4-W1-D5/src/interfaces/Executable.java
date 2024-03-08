package interfaces;
//I insert the play and turn up/down volume methods into the interfaces to ensure that they are implemented only in AudioRecording and Video
public interface Executable {
    public void play();
    public void turnUpVolume();
    public void turnDownVolume();
}
