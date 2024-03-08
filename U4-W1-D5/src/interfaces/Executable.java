package interfaces;
//Inserisco i metodi play e turn up/down volume nelle interfacce per fare in modo di implementarli solo in AudioRecording e Video
public interface Executable {
    public void play();
    public void turnUpVolume();
    public void turnDownVolume();
}
