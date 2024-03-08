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
            System.out.println(this.title + " " + "!".repeat(volume)); //uso il metodo delle stringhe repeat() sulla stringa "!" per fare in modo che la stringa sia ripetuta quante volte il parametro passato dal volume
        }
    }

    public void turnUpVolume() {
        volume++;
    }
    public void turnDownVolume() {
        if (volume > 0 ) { //solo se il volume è maggiore di zero (per non rendere il volume negativo)
            volume--;
        }
    }

    //SETTER:

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
