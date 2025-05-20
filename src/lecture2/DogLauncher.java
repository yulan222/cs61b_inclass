package lecture2;

public class DogLauncher {

    public static void main(String[] args) {
        Dog smallDog; // Declaration of a Dog variable
        new Dog(20); // Instantiation of the Dog class as a dog Object
        smallDog = new Dog(10); // Instantiation and Assignment
        Dog hugeDog = new Dog(100); // Declaration, Instantiation and Assignment
        smallDog.makeNoise();
        hugeDog.makeNoise(); // Invocation of the 150 lb Dog's makeNoise method

        Dog d = new Dog(100);
        d.makeNoise();

        Dog chester = new Dog(17);
        Dog yusuf = new Dog(150);
        Dog larger = Dog.maxDog(chester, yusuf);
        larger.makeNoise();

        Dog larger_2 = chester.maxDog(yusuf);
        larger_2.makeNoise();

        System.out.println(Dog.binomen);
    }

}
