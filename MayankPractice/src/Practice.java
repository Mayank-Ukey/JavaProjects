import javax.print.attribute.standard.Media;

class CellPhone{
    String color;
    int battery;
}

interface GPS{
    void turnRight();
    void turnLeft();
    void goStraight();
    void uTurn();
}

interface MediaPlayer{
    void playMusic();
    void stopMusic();
    private void greet(){
        System.out.println("Good Morning.");
    }
    default void playMusic3D(){
        greet();
        System.out.println("Playing 3D Music.");
    }
}

interface Camera{
    void openCamera();
    void clickPhoto();
    void closeCamera();
}

class SmartPhone extends CellPhone implements GPS, MediaPlayer, Camera{
    void faceUnlock(){
        System.out.println("Keep your face aligned.");
        System.out.println("Unlocking smartphone...");
    }

    public void turnRight(){
        System.out.println("Turning right.");
    }
    public void turnLeft(){
        System.out.println("Turning left.");
    }
    public void goStraight(){
        System.out.println("Going straight");
    }
    public void uTurn(){
        System.out.println("Taking U turn");
    }
    public void playMusic(){
        System.out.println("Playing music.");
    }
    public void stopMusic(){
        System.out.println("Music stopped.");
    }

    public void playMusic3D(){
        System.out.println("Playing and recording music in 3D.");
    }
    public void openCamera(){
        System.out.println("Opening camera.");
    }
    public void clickPhoto(){
        System.out.println("Clicking photo.");
    }
    public void closeCamera(){
        System.out.println("Closing camera.");
    }
}

public class Practice{
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.faceUnlock();
        sp.goStraight();
        sp.clickPhoto();
        sp.playMusic();
        sp.playMusic3D();
    }
}