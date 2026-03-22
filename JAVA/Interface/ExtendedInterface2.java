// another example of one interface extended by multiple interfaces
//use of default method in interface(Java 8 feature)

//first interface
interface Camera {
    void takePhoto();
    //default method
    default void recordVideo() {
        System.out.println("Recording video...");
    }
}
//second interface
interface MusicPlayer {
    void playMusic();
}
//third interface extending first and second interface
interface SmartDevice extends Camera, MusicPlayer {
    void connectToInternet();
}
//class implementing the third interface
class Smartphone implements SmartDevice {
    @Override 
    public void takePhoto() {
        System.out.println("Taking photo...");
    }
    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }
    @Override
    public void connectToInternet() {
        System.out.println("Connecting to internet...");
    }
}
//main method
public class ExtendedInterface2 {
    public static void main(String[] args) {
        SmartDevice device = new Smartphone();

        device.takePhoto();
        device.playMusic();
        device.connectToInternet();

        //calling default method from camera interface
        device.recordVideo();
    }
}