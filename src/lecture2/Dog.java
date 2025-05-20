package lecture2;

public class Dog {

    public int weightInPounds; // Instance variable 变量

    public static String binomen = "Canis familiaris";

    /** Constructor */
    public Dog(int startingWeight) {
        weightInPounds = startingWeight;
    }

    /** non-static method aka. instance method */
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("Bark!");
        } else {
            System.out.println("Arooooo!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2){
        if(d1.weightInPounds > d2.weightInPounds){
            return d1;
        } else {
            return d2;
        }
    }

    public Dog maxDog(Dog d2){
        if (weightInPounds > d2.weightInPounds){
            return this;
        } else {
            return d2;
        }
    }
}
