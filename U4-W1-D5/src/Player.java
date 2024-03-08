import entities.AudioRecording;
import entities.Image;
import entities.MultimediaItem;
import entities.Video;

import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
        MultimediaItem[] elements = new MultimediaItem[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("* Playing Ground Theme - Super Mario Bros. in background...*");
        System.out.println("Hello welcome in our player!");

        //-------------------------------Initializing objects of array--------------------------------------
        for (int i = 0; i < 5; i++){
            System.out.println("Please insert the type of the element you want to create: 1 -> audio recoding; 2 -> video; 3 -> image");
            int type = Integer.parseInt(scanner.nextLine());
            System.out.println("Now please insert the title of the element you want to create:");
            String title = scanner.nextLine();

            switch(type) {
                case 1:
                    System.out.println("You have chosen the Audio Recording type");
                    System.out.println("Please enter the duration as an integer:");
                    int durationAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please enter the volume as an integer:");
                    int volumeAudio =Integer.parseInt(scanner.nextLine());
                    elements[i] = new AudioRecording(title, volumeAudio, durationAudio);
                    System.out.println("------------------------------------------------");
                    break;
                case 2:
                    System.out.println("You have chosen the Video type");
                    System.out.println("Please enter the duration as an integer:");
                    int durationVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please enter the volume as an integer:");
                    int volumeVideo =Integer.parseInt(scanner.nextLine());
                    System.out.println("Please enter the brightness as an integer:");
                    int brightnessVideo =Integer.parseInt(scanner.nextLine());
                    elements[i] = new Video(title, volumeVideo, brightnessVideo, durationVideo);
                    System.out.println("------------------------------------------------");
                    break;
                case 3:
                    System.out.println("You have chosen the Image type");
                    System.out.println("Please enter the brightness as an integer:");
                    int brightnessImage = Integer.parseInt(scanner.nextLine());
                    elements[i] = new Image(title, brightnessImage);
                    System.out.println("------------------------------------------------");
                    break;
                default:
                    System.out.println("You have insert a wrong type! Insert 1, 2 or 3!");
                    i--; //to repeat the operation!
            }
        }


        //---------------------------------------Execution of the elements:------------------------------------

        System.out.println("Now, you have created a playlist with your multimedia items created before.");
        int choice;
        do {
            System.out.println("If you want to execute your multimedia, insert a number from 1 to 5 (or 0 to exit):");
             choice = Integer.parseInt(scanner.nextLine());

            if (choice >= 1 && choice <= 5) {
                MultimediaItem itemChosen = elements[choice - 1];

                if (itemChosen instanceof AudioRecording) {
                    System.out.println("Playing audio...");
                    ((AudioRecording) itemChosen).play();
                    System.out.println("------------------------------------------------");
                    //----------TURN UP/DOWN VOLUME AUDIO -----------
                    System.out.println("Do you want to turn up the volume? Answer Y/N");
                    String answer = scanner.nextLine().toUpperCase();
                    if( answer.equals("Y")) {
                        ((AudioRecording) itemChosen).turnUpVolume();
                        System.out.println("Playing audio...");
                        ((AudioRecording) itemChosen).play();
                    }
                    System.out.println("------------------------------------------------");
                    System.out.println("Do you want to turn down the volume? Answer Y/N");
                    String answerTwo = scanner.nextLine().toUpperCase();
                    if( answerTwo.equals("Y")) {
                        ((AudioRecording) itemChosen).turnDownVolume();
                        System.out.println("Playing audio...");
                        ((AudioRecording) itemChosen).play();
                    }
                    System.out.println("------------------------------------------------");
                   //--------------SET VOLUME AUDIO:---------------
                    System.out.println("Do you want to set manually the volume? Answer Y/N");
                    String answerSet = scanner.nextLine().toUpperCase();
                    if(answerSet.equals("Y")) {
                        System.out.println("Insert a new value for the volume as integer:");
                        int volume = Integer.parseInt(scanner.nextLine());
                        ((AudioRecording) itemChosen).setVolume(volume);
                        System.out.println("Playing audio...");
                        ((AudioRecording) itemChosen).play();
                    }
                    System.out.println("------------------------------------------------");

                } else if (itemChosen instanceof Video) {
                    System.out.println("Playing video...");
                    ((Video) itemChosen).play();

                    //----------TURN UP/DOWN VOLUME VIDEO -----------
                    System.out.println("Do you want to turn up the volume? Answer Y/N");
                    String answerVideoVolume = scanner.nextLine().toUpperCase();
                    if( answerVideoVolume.equals("Y")) {
                        ((Video) itemChosen).turnUpVolume();
                        System.out.println("Playing video...");
                        ((Video) itemChosen).play();
                    }
                    System.out.println("------------------------------------------------");
                    System.out.println("Do you want to turn down the volume? Answer Y/N");
                    String answerVideoVolumeTwo = scanner.nextLine().toUpperCase();
                    if( answerVideoVolumeTwo.equals("Y")) {
                        ((Video) itemChosen).turnDownVolume();
                        System.out.println("Playing video...");
                        ((Video) itemChosen).play();
                    }
                    System.out.println("------------------------------------------------");

                    //----------INCREASE/DECREASE BRIGHTNESS VIDEO -----------
                    System.out.println("Do you want to increase the brightness? Answer Y/N");
                    String answerVideoBrightness = scanner.nextLine().toUpperCase();
                    if(answerVideoBrightness.equals("Y")) {
                        ((Video) itemChosen).increaseBrightness();
                        System.out.println("Playing video...");
                        ((Video) itemChosen).play();
                    }
                    System.out.println("------------------------------------------------");
                    System.out.println("Do you want to decrease the brightness? Answer Y/N");
                    String answerVideoBrightnessTwo = scanner.nextLine().toUpperCase();
                    if(answerVideoBrightnessTwo.equals("Y")){
                        ((Video) itemChosen).decreaseBrightness();
                        System.out.println("Playing video...");
                        ((Video) itemChosen).play();
                    }
                    System.out.println("------------------------------------------------");

                    //--------------SET VOLUME VIDEO:---------------
                    System.out.println("Do you want to set the volume manually? Answer Y/N");
                    String answerSetVideo = scanner.nextLine().toUpperCase();
                    if(answerSetVideo.equals("Y")) {
                        System.out.println("Insert a new value for the volume as integer:");
                        int volumeVideo = Integer.parseInt(scanner.nextLine());
                        ((Video) itemChosen).setVolume(volumeVideo);
                        System.out.println("Playing video...");
                        ((Video) itemChosen).play();
                    }
                    System.out.println("------------------------------------------------");

                    //--------------SET BRIGHTNESS VIDEO:---------------
                    System.out.println("Do you want to set the brightness manually? Answer Y/N");
                    String answerSetBrightnessVideo = scanner.nextLine().toUpperCase();
                    if(answerSetBrightnessVideo.equals("Y")) {
                        System.out.println("Insert a new value for the brightness as integer:");
                        int brightnessVideo = Integer.parseInt(scanner.nextLine());
                        ((Video) itemChosen).setBrightness(brightnessVideo);
                        System.out.println("Playing video...");
                        ((Video) itemChosen).play();
                    }
                    System.out.println("------------------------------------------------");


                } else if (itemChosen instanceof Image) {
                    System.out.println("Showing image...");
                    ((Image) itemChosen).show();
                    //----------INCREASE/DECREASE BRIGHTNESS IMAGE -----------
                    System.out.println("Do you want to increase the brightness? Answer Y/N");
                    String answerImageBrightness = scanner.nextLine().toUpperCase();
                    if(answerImageBrightness.equals("Y")) {
                        ((Image) itemChosen).increaseBrightness();
                        System.out.println("Showing image...");
                        ((Image) itemChosen).show();
                    }
                    System.out.println("------------------------------------------------");
                    System.out.println("Do you want to decrease the brightness? Answer Y/N");
                    String answerImageBrightnessTwo = scanner.nextLine().toUpperCase();
                    if(answerImageBrightnessTwo.equals("Y")){
                        ((Image) itemChosen).decreaseBrightness();
                        System.out.println("Showing image...");
                        ((Image) itemChosen).show();
                    }
                    System.out.println("------------------------------------------------");
                    //--------------SET BRIGHTNESS IMAGE:---------------
                    System.out.println("Do you want to set the brightness manually? Answer Y/N");
                    String answerSetBrightnessImage = scanner.nextLine().toUpperCase();
                    if(answerSetBrightnessImage.equals("Y")) {
                        System.out.println("Insert a new value for the brightness as integer:");
                        int brightnessVideo = Integer.parseInt(scanner.nextLine());
                        ((Image) itemChosen).setBrightness(brightnessVideo);
                        System.out.println("Showing image...");
                        ((Image) itemChosen).show();
                    }
                    System.out.println("------------------------------------------------");

                }
            }
        } while (choice != 0);

        System.out.println("You have choose to turn off the player, goodbye!");
        System.out.println("Closing player...");

    }
}
