package entities;

import interfaces.Brightness;
import interfaces.Executable;

public class Video extends MultimediaItem implements Executable, Brightness {

    //ATTRIBUTES LIST:
    private int volume;
    private int brightness;
    private int duration;

    //CONSTRUCTORS:
    public Video (String title, int volume, int brightness, int duration) {
        super(title);
        this.volume = volume;
        this.brightness = brightness;
        this.duration = duration;
    }


    //INTERFACES METHOD:
    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.println( this.title + " " + "!".repeat(volume) + " " + "*".repeat(brightness));
        }
    }

    @Override
    public void turnUpVolume() {
        this.volume++;
    }

    @Override
    public void turnDownVolume() {
        if(this.volume > 0) {
            this.volume--; //solo se il volume è maggiore di zero (per non rendere il volume negativo)
        }
    }

    @Override
    public void increaseBrightness() {
        this.brightness++;
    }

    @Override
    public void decreaseBrightness() {
        if(this.brightness > 0 ){
            this.brightness--;
        }
    }
}
