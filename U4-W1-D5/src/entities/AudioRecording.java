package entities;

public class AudioRecording extends MultimediaItem {

    //ATTRIBUTES LIST:
    private int volume;
    private int duration;

    //CONSTRUCTORS:
    public AudioRecording (String title, int volume, int duration) {
        super(title);
        this.volume = volume;
        this.duration = duration;
    }

    //METHODS:

    public void turnUpVolume () {
        volume++;
    }
    public void turnDownVolume () {
        if (volume > 0 ) { //solo se il volume è maggiore di zero (per non rendere il volume negativo)
            volume--;
        }
    }
}
