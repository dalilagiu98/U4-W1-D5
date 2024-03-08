package entities;

import interfaces.Brightness;

public class Image extends MultimediaItem implements Brightness {

    //ATTRIBUTES LIST:
    private int brightness;

    //CONSTRUCTOR:
    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }


    //INTERFACES METHODS:
    @Override
    public void increaseBrightness() {
        this.brightness++;
    }

    @Override
    public void decreaseBrightness() {
        if (this.brightness > 0) {
            this.brightness--;
        }
    }
}
