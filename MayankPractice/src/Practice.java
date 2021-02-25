// Interfaces in Java

interface Bicycle{
    int a = 15;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface BlowHorn{
    void blowHornK3g();
    void blowHornMHN();
}

class AvonCycle implements Bicycle, BlowHorn{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake.");
    }

    public void speedUp(int increment){
        System.out.println("Incrementing speed.");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee");
    }
    public void blowHornMHN(){
        System.out.println("Main hoon na po po po");
    }
}

public class Practice{
    public static void main(String[] args) {
        AvonCycle cycle1 = new AvonCycle();
        cycle1.applyBrake(1);
        cycle1.speedUp(1);
        cycle1.blowHorn();
        // We can create properties or attributes in interfaces
        System.out.println(cycle1.a);

        // We cannot modify the properties or attributes in interfaces,
        // as they are final
//        cycle1.a = 20; // Not allowed

        // We can implement two or more interface in a single class.
        // Just like we've implemented Bicycle and BlowHorn in AvonCycle.
        cycle1.blowHornK3g();
        cycle1.blowHornMHN();
    }
}