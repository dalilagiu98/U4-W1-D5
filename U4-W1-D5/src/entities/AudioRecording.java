package entities;

import interfaces.Executable;

public class AudioRecording extends MultimediaItem implements Executable {

    //ATTRIBUTES LIST:
    private int volume;
    private int duration;

    //CONSTRUCTORS:
    public AudioRecording (String title, int volume, int duration) {
        super(title);
        this.volume = volume;
        this.duration = duration;
    }

    //INTERFACES METHODS:
    @Override
    public void play() {
        for (int i = 0; i < duration; i++){
            System.out.println(this.title + " " + "!".repeat(volume)); //I use the repeat() string method on the string "!" to ensure that the string is repeated as many times as the parameter passed by the volume
        }
    }

    public void turnUpVolume() {
        volume++;
    }
    public void turnDownVolume() {
        if (volume > 0 ) { //only if the volume is greater than zero (so as not to make the volume negative)
            volume--;
        }
    }

    //SETTER:

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
